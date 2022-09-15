import java.util.Scanner;
class Carnival
{
    public static void main(String args[])
    {
        int h,s,ss;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        s=sc.nextInt();
        ss=sc.nextInt();
        if(h>50 && s>60 && ss>100)
        {
            System.out.print("10");
        }
        else if(h>50 && s>60)
        {
            System.out.print("9");
        }
        else if(s>60 && ss>100)
        {
            System.out.print("8");
        }
        else if(h>50 && ss>100)
        {
            System.out.print("7");
        }
        else if(h>50 || s>60 || ss>100)
        {
            System.out.print("6");
        }
        else
        {
            System.out.print("5");
        }
    }
}