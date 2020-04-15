package com.company;

public class Ksiazka extends Zasoby{
    private int ilosc_stron;
    private int waga;
    private String wydawca;
    private Oprawa okladka;     //Kompozycja


    public Ksiazka(int id, int cena, String data_wydania, String autor, int ilosc_stron, int waga, String wydawca) {
        super(id, cena, data_wydania, autor);
        this.ilosc_stron = ilosc_stron;
        this.waga = waga;
        this.wydawca = wydawca;
        this.okladka= new Oprawa();
        this.okladka.setKolor("Czarny");    //
        this.okladka.setMaterial("Papier"); //Kompozycja
        this.okladka.setTypOprawy("twardy");//
    }

    public int getIlosc_stron() {
        return ilosc_stron;
    }

    public void setIlosc_stron(int ilosc_stron) {
        this.ilosc_stron = ilosc_stron;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getWydawca() {
        return wydawca;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }
    public String getTypOprawy(){
        return this.okladka.getTypOprawy();
    }

}



