package Testowanie;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest; // pakiet do pisania testów
import static org.junit.jupiter.api.Assertions.*; //asercje

public class TestowanieJednostkowe
{
    private Testowanie test1= new Testowanie();
    @Test
    void test1()
    {
        assertEquals(true, test1.temp(50,69));
    }

    @Test
    void test2()
    {
        int[] tablicaTestowa={3,3,1,2,3};
        assertEquals(true, test1.sekwencja(tablicaTestowa));
    }
    @Test
    void test3()
    {
        assertEquals("ab", test1.halfString("abcd"));
    }
    @Test
    void test4()
    {
        int[] tablicaTestowa1={1,2,3,4,5};
        int[] tablicaTestowa2={5,4,3,2,1};
        assertArrayEquals(tablicaTestowa1, test1.arrayInt(tablicaTestowa2));
    }


}
