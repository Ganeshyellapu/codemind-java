import java.util.*;
class Substring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int h=0;h<t;h++)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int ct=0;
            for(int i=0;i<n;i++)
            {
                String s1="";
                for(int j=i;j<n;j++)
                {
                    char c=s.charAt(j);
                    s1=s1+c;
                    if(s1.charAt(0)=='1' && s1.charAt(s1.length()-1)=='1')
                    {
                        ct+=1;
                    }
                    
                }
            }
            System.out.println(ct);
        }
    }
}