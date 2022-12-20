import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,d=0,sp=0;
        String vowel="AEIOUaeiou";
        String dig="0123456789";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(vowel.contains(ch+""))
            {
                v+=1;
            }
            else if(dig.contains(ch+""))
            {
                d+=1;
            }
            else if(ch==' ')
            {
                sp+=1;
            }
            else
            {
                c+=1;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+sp);
    }
}