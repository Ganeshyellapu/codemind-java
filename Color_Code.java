import java.util.Scanner;
class Colour
{
    public static void main(String args[])
    {
        String a,cap;
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        cap=a.toUpperCase();
        if(cap.equals("V"))
        {
           System.out.print("Violet"); 
        }
        else if(cap.equals("I"))
        {
            System.out.print("Indigo");
        }
        else if(cap.equals("B"))
        {
            System.out.print("Blue");
        }
        else if(cap.equals("Y"))
        {
            System.out.print("Yellow");
        }
        else if(cap.equals("O"))
        {
            System.out.print("Orange");
        }
        else if(cap.equals("G"))
        {
            System.out.print("Green");
        }
        else if(cap.equals("R"))
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print("-1");
        }
    }
}