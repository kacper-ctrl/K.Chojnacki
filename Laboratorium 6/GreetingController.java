package hello;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
@RestController
public class GreetingController {
    private static final String template2 = "masz %d, lat!";
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired // Wstrzykiwanie zależności przez pole
            CountService countService;
    @RequestMapping(path="/bye", method = GET) // odpowiada endpoin'tom http
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template, countService.count(name)));
    }
    @RequestMapping(path="/bye01", method = GET) // odpowiada endpoin'tom http
    public Greeting greeting01(@RequestParam(value = "wiek", defaultValue = "") int wiek) {
        return new Greeting(counter.incrementAndGet(),String.format(template2, wiek));
    }
    @RequestMapping(path="/bye02", method = GET) // odpowiada endpoin'tom http
    public Osoba osoba(@RequestParam(value = "imie", defaultValue = "") String imie,
                       @RequestParam(value = "wiek", defaultValue = "0") int wiek) {
        return new Osoba(counter.incrementAndGet(),String.format(template, imie), String.format(template2, wiek) );
    }
    @RequestMapping(path="/gender", method = GET) // odpowiada endpoin'tom http
    public Greeting greeting05(@RequestParam(value = "name", defaultValue = "World") String name) {
        if(name.endsWith("a"))
        {
            return new Greeting(counter.incrementAndGet(),"imie żenskie");
        }
        return new Greeting(counter.incrementAndGet(),"imie meskie");
    }
    @RequestMapping(path="/zgadywanie", method = GET) // odpowiada endpoin'tom http
    public Greeting greeting05(@RequestParam(value = "wartosc", defaultValue = "") int wartosc) {
        if(wartosc==5)
        {
            return new Greeting(counter.incrementAndGet(),"odgadles");
        }
        return new Greeting(counter.incrementAndGet(),"porazka");
    }
}

