import java.util.Scanner;
class Disk
{
    public static void main(String args[])
    {
        int t,s,b,block,surface,total;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        block=b*512;
        surface=t*s*block;
        total=2*surface;
        System.out.print(total);
        
        
    }
}