import java.util.*;
class Diagonals
{
    public static void main(String args[])
    {
        int n,d;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        d=(n*(n-3))/2;
        System.out.print(d);
    }
}