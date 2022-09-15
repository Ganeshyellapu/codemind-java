import java.util.Scanner;
class Electricity
{
    public static void main(String args[])
    {
        String id,name;
        double total=0,units,charge;
        Scanner sc=new Scanner(System.in);
        id=sc.nextLine();
        name=sc.nextLine();
        units=sc.nextDouble();
        if(units<=199)
        {
            total=units*1.20;
        }
        else if(units>=200 && units<400)
        {
            total=units*1.50;
        }
        else if(units>=400 && units<600)
        {
            total=units*1.80;
        }
        else if(units>=600)
        {
            total=units*2.00;
        }
        
        if(total>400)
        {
            charge=total*0.15;
        }
        else
        {
            charge=100.0;
        }
        System.out.format("%.2f",total+charge);
    }
}