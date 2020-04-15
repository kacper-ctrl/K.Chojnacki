package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int[] tab={0,155,142,78,456,875,451,99,78,10,45,75}; //tablica 12 elementowa

        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj numer elementu tablicy, ktory chcesz wyswietlic");
        int in = scan.nextInt();

        while (true)
        {
            try
            {
                System.out.println("Zawartosc danego indeksu to: " + tab[in]);
                System.out.println("Wszystko ok");
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Podałeś zły znak lub przekroczyles zakres tablicy.");
            }

            System.out.println("Podaj jeszcze raz nr elementu tablicy.");
             in= scan.nextInt();
        }
    }
}
