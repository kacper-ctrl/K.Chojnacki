package Testowanie;

public class Testowanie {
    public static void main(String[] args)
    {
        System.out.println(temp(124,144));
        int[] proba= {0,1,2,4};
        int[] proba1= arrayInt(proba);
        for(int i=0; i<proba1.length;i++) {
            System.out.print(proba1[i]+"\t");
        }

    }
    public static boolean temp(double a, double b){
        if(a<100 || b<100 )
        {
            return true;
        }
        else return false;
    }
    public static boolean sekwencja(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            if(array[i]==1 && array[i+1]==2 && array[i+2]==3)
                return true;
        }
        return false;
    }
    public static String halfString(String a)
    {
        return a.substring(0, a.length()/2);
    }
    public static int[] arrayInt(int array[])
    {

        int x;
        for(int i=0; i<(array.length-1)/2; i++ )
        {
            x=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=x;
        }
        return array;


    }
}
