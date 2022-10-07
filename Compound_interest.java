import java.util.*;
class Compound
{
    public static void main(String args[])
    {
        double p,t,r;
        double c;
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        c = p *(Math.pow(1 + (r / 100),t));
        //c=p*(Math.pow((1+(r/100)),t));
        System.out.printf("%.2f",c);
    }
}