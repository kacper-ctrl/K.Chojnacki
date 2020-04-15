import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
    System.out.println("Podaj jakis znak,a ja zamienie go na liczbe");
    Scanner scan= new Scanner(System.in);
    String znaki= scan.nextLine();
    while(true)
    {
        try
        {
            int liczba = Integer.parseInt(znaki);
            System.out.println("Twoja liczba to " + liczba);
            System.out.println("Wszystko poszlo dobrze");
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
            System.out.println("Błędne dane ");
        }
        System.out.println("Podaj ponownie jakis znak");
        znaki=scan.nextLine();
    }

    }
}
