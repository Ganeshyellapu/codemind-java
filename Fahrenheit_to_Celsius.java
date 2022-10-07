import java.util.*;
class Fah_cel
{
    public static void main(String args[])
    {
        float f;
        float c;
        Scanner sc=new Scanner(System.in);
        f=sc.nextFloat();
        c=(f-32)*5/9;
        System.out.printf("%.2f",c);
        
    }
}