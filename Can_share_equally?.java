import java.util.Scanner;
class Share
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+2*y;
        if(z%2==0 && z!=0)
        {
            if(x==0 && y%2!=0)
            {
                System.out.print("NO");
            }
            else
            {
                System.out.print("YES");
            }
        }
        else
        {
            System.out.print("NO");
        }
    }
}