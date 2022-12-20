import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a=sc.nextLine().charAt(0);
        int c=0;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==a)
            {
                c+=1;
                k+=1;
            }
        }
        if(k==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(c);   
        }
    }
}