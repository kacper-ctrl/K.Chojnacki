package com.company;
import java.util.Scanner;

public class Klient {
    private int klient_id;
    private String imie_nazwisko;
    private int wypozyczone;
    private int czas_od_wypozyczenia;
    private double kara = 0.00;

    public Klient(int klient_id, String imie_nazwisko) {
        this.klient_id = klient_id;
        this.imie_nazwisko = imie_nazwisko;
    }

    public int getKlient_id() {
        return klient_id;
    }

    public void setKlient_id(int klient_id) {
        this.klient_id = klient_id;
    }

    public String getImie_nazwisko() {
        return imie_nazwisko;
    }

    public void setImie_nazwisko(String imie_nazwisko) {
        this.imie_nazwisko = imie_nazwisko;
    }

    public int getWypozyczone() {
        return wypozyczone;
    }

    public void setWypozyczone(int wypozyczone) {
        this.wypozyczone = wypozyczone;
    }

    public int getCzas_od_wypozyczenia() {
        return czas_od_wypozyczenia;
    }

    public void setCzas_od_wypozyczenia(int czas_od_wypozyczenia) {
        this.czas_od_wypozyczenia = czas_od_wypozyczenia;
    }

    public double getKara() {
        return kara;
    }

    public void setKara(double kara) {
        this.kara = kara;
    }

    public void wypozycz() {
        if (wypozyczone == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj numer ID zasobu.");
            String ID_zasobu = scan.nextLine();
            wypozyczone = Integer.parseInt(ID_zasobu);
            System.out.println("Zostalo wypozyczone dzielo o numerze id:"+wypozyczone);

        } else {
            System.out.println("Niestety, ale musisz coś oddać.");
        }
    }

    public void oddaj() {

        int P1;
        int P2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj numer zasobu, ktory chcesz zwrocic:");
        String ID_zasobu = scan.nextLine();
        P1 = Integer.parseInt(ID_zasobu);
        if (P1 == wypozyczone) {
            System.out.println("Podaj ile dni minelo od wypozyczenia");
            String dni_s = scan.nextLine();
            P2 = Integer.parseInt(dni_s);
            if (P2 > 30) {
                kara=30;
                System.out.println("Zostala naliczona kara w wysokoci: "+kara+"PLN");

            } else {
                System.out.println("Dzielo zostalo zwrocone");
                wypozyczone=0;
            }
        } else {
            System.out.println("To nie jest nasze");
        }
    }
}