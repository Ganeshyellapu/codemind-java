import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            char c=(char)(i+64);
            for(int j=1;j<=rows;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}