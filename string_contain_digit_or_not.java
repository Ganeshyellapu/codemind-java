import java.util.*;
class contain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String dig="0123456789";
        int c=0;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(dig.contains(ch+""))
            {
                c+=1;
                k+=1;
            }
        }
        if(k==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else
        {
            System.out.println("Contains "+c+" digit");   
        }
    }
}