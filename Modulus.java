import java.util.Scanner;
class modulus
{
    public static void main(String args[])
    {
        int a,b,modulus;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        modulus=a%b;
        System.out.print(modulus);
    }
}