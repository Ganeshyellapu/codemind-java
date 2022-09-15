import java.util.Scanner;
class Rain
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String raindrop="";
        if(n%3==0)
        {
            raindrop+="Pling";
        }
        if(n%5==0)
        {
            raindrop+="Plang";
        }
        if(n%7==0)
        {
            raindrop+="Plong";
        }
        if(n%3!=0 && n%5!=0 && n%7!=0)
        {
            System.out.print(n);
        }
        else
        {
            System.out.print(raindrop);
        }
    }
}