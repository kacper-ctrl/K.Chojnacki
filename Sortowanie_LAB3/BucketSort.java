package com.company;

public class BucketSort implements Sortable {
    private double licznik;

    @Override
    public int[] sort(int[] tab) {
        int min = tab[0]; //pierwsza zmienna ---> min

        for(int i=1;i<tab.length;i++){ //porownanie 200 elementow               //
            if(min>tab[i])                                                      //
                min = tab[i];}                                                  //  Sprwdzenie ile kubelkow potrzeba
        int max = tab[0]; //druga zmienna --->max
                                                                                //
        for(int i=1;i<tab.length;i++) //porownanie 200 elementow                //
            if(max<tab[i])
                max= tab[i];
            int ilosKubelkow= (max-min)+1;
        int[] bucket = new int[ilosKubelkow];                   //tablica o dlugosci [ilosc kubelkow]
        int[] posortowanaTablica = new int[tab.length];



        for (int i= 0; i <tab.length; i++) {

            bucket[tab[i]]++;
            licznik++;                                          //zliczanie elementow w danym kubelku
        }
        int pos = 0;
        for (int i = 0; i < bucket.length; i++) {


            for (int j = 0; j < bucket[i]; j++) {
                                                                //wpisywanie n elementow danego kubelka do tablicy wynikowej
                posortowanaTablica[pos++] = i;
            }
        }
        return posortowanaTablica;
    }

    @Override
    public double step_counting() {
        System.out.println(licznik);
        return 0;
    }
}
