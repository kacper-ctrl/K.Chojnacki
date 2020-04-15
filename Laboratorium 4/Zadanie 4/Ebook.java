package com.company;

public class Ebook extends Ksiazka {
    private int rozmiar_pliku;
    private String format_pliku;


    public Ebook(int id, int cena, String data_wydania, String autor, int ilosc_stron, int waga, String wydawca, int rozmiar_pliku, String format_pliku) {
        super(id, cena, data_wydania, autor, ilosc_stron, waga, wydawca);
        this.rozmiar_pliku = rozmiar_pliku;
        this.format_pliku = format_pliku;
    }

    public int getRozmiar_pliku() {
        return rozmiar_pliku;
    }

    public void setRozmiar_pliku(int rozmiar_pliku) {
        this.rozmiar_pliku = rozmiar_pliku;
    }

    public String getFormat_pliku() {
        return format_pliku;
    }

    public void setFormat_pliku(String format_pliku) {
        this.format_pliku = format_pliku;
    }

}
