import java.util.Scanner;
class Car
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            float car1=(float)y1/x1;
            float car2=(float)y2/x2;
            if(car1>car2)
            {
                System.out.println("1");
            }
            else if(car1<car2)
            {
                System.out.println("-1");
            }
            else if(car1==car2)
            {
                System.out.println("0");
            }
        }
    }
}                                               