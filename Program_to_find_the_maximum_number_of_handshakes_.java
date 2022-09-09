import java.util.Scanner;
class maximum
{
    public static void main(String args[])
    {
        int n,hand;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        hand=(n*(n-1))/2;
        System.out.print(hand);
    }
}