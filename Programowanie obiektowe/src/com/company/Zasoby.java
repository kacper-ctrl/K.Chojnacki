package com.company;

public class Zasoby {
    private int id;
    private int cena;
    private String data_wydania;
    private String autor;
      //Składowe obiektów należy oznaczać jako prywatne inaczej niż metody
    //                             ustawiające i zwracające, które powinny być publiczne. Proces ten
    //                             nosi nazwę Hermetyzacji. Dostep do skladowych realizowany jest
    //                             przez publiczne metody.
//konstruktor sluzy do inicjalizacji obiektu danej klasy
    public Zasoby(int id, int cena, String data_wydania, String autor) {
        this.id = id;
        this.cena = cena;
        this.data_wydania = data_wydania;
        this.autor = autor;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getData_wydania() {
        return data_wydania;
    }

    public void setData_wydania(String data_wydania) {
        this.data_wydania = data_wydania;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }




}


