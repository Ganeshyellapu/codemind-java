import java.util.*;
class Reverse
{
    public static int rev(int n)
    {
        int r,rev=0;
        while(n>0)
        {
          r=n%10;
          rev=rev*10+r;
          n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        while(true)
        {
            y=x+rev(x);
            if(y==rev(y))
            {
                System.out.print(y);
                break;
            }
            else
            {
              x=y;  
            }
        }
    }
}