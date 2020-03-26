package com.company;

public class Film extends Zasoby{
    private int czas_trwania;
    private String rozdzielczosc ;

    public Film(int id, int cena, String data_wydania, String autor, int czas_trwania, String rozdzielczosc) {
        super(id, cena, data_wydania, autor);
        this.czas_trwania = czas_trwania;
        this.rozdzielczosc = rozdzielczosc;
    }

    public int getCzas_trwania() {
        return czas_trwania;
    }

    public void setCzas_trwania(int czas_trwania) {
        this.czas_trwania = czas_trwania;
    }

    public String getRozdzielczosc() {
        return rozdzielczosc;
    }

    public void setRozdzielczosc(String rozdzielczosc) {
        this.rozdzielczosc = rozdzielczosc;
    }
}
