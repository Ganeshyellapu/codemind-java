import java.util.*;
class patterns
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--)
        {
            char c=(char)(i+64);
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}