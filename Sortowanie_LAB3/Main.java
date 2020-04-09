package com.company;


import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Random r= new Random();
        int[] tablica= new int[200];
        for(int i=0; i<tablica.length; i++){
            tablica[i]=r.nextInt(10);
        }
        printArray(tablica);
            int wybor=0;
	        wybor=menu();
	            while(wybor!=0){
	            switch(wybor){
                case 1:

                    BubbleSort attemp= new BubbleSort();

                    Main.printArray(attemp.sort(tablica));
                    attemp.step_counting();
                    wybor=0;
                System.in.read();
                break;
                case 2:

                    BucketSort attemp1= new BucketSort();
                    Main.printArray(attemp1.sort(tablica));
                    attemp1.step_counting();
                    wybor=0;
                 System.in.read();
                    break;
	    }
    }
    }

    public static int menu(){
        System.out.println();
        System.out.println("     MENU-UZYTKOWNIKA     ");
        System.out.println("     1.Posortuj- babelkowo");
        System.out.println("     2.Posortuj- kubelkowo");



        Scanner in= new Scanner(System.in);
        int w= in.nextInt();
        return w;
    }
    public static void printArray(int[] tab){
        for(int j=0;j<tab.length;j++){
            System.out.print(tab[j]+" ");


        }
        System.out.println();
    }
}
