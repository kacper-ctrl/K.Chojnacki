
package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Ksiazka ksiazka1=new Ksiazka(2549,
            20,
            "14.05.1997",
            "Autor",
            543,
            500,
            "Helion"
    );
    Ebook ksiazkaEbook = new Ebook(
            2545,
            14,
            "25.10.1994",
            "Helion",
            324,
            0,
            "Helion",
            50,
            "PDF");
    Film film1 = new Film(1542,
            30,
            "04.12.2005",
            "Autor2",
            130,
            "1080p");
    Klient pierwszyKlient= new Klient(12345, "Jan Kowalski");

    Scanner scan=new Scanner(System.in);

    while(true) {
            System.out.println("1.wypozycz");
            System.out.println("2.oddaj");
            int dane = scan.nextInt();
            switch(dane) {
                case 1:
                    pierwszyKlient.wypozycz();
                    System.out.println(ksiazka1.getTypOprawy());
                    break;
                case 2:
                    pierwszyKlient.oddaj();
                    break;

                default:
                    System.out.println("Blad odczytu. Sprobuj jeszcze raz.");
                    break;

            }
        }

    }
}
