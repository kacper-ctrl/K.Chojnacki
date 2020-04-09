package com.company;

public class BubbleSort implements Sortable {
    private double licznik;

    @Override
    public int[] sort(int[] tab) {
        int e= tab.length; //Liczba elementow tablicy do posortowania
        int it=0; //licznik
        while(it<e-1)//wykonaj e-1 porownan elementow tablicy
        {
            for(int j=0; j<e-1; j++){
                licznik++;
                if(tab[j]>tab[j+1]){
                    replacement(tab,j,j+1);
                }
            }
        it++;
        }

        return  tab;
    }

    @Override
    public double step_counting() {
        System.out.println(licznik);





        return 0;
    }
    private void replacement(int[] tab, int i1, int i2){
        int temporary= tab[i1];
        tab[i1]=tab[i2];
        tab[i2]=temporary;
    }
}
