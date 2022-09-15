import java.util.Scanner;
class Vowel
{
    public static void main(String args[])
    {
        String c,cap;
        Scanner sc=new Scanner(System.in);
        c=sc.next();
        cap=c.toUpperCase();
        if(cap.equals("A") || cap.equals("E") || cap.equals("I") || cap.equals("O") || cap.equals("U"))
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}