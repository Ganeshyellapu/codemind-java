import java.util.Scanner;
class floating
{
    public static void main(String args[])
    {
        float a,b,res;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        res=a*b;
        System.out.format("%.2f",res);
    }
}