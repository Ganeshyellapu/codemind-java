import java.util.*;
class Search
{
  public static void main(String args[])
  {
      int n,a;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      a=sc.nextInt();
      int c=0;
      for(int i=0;i<n;i++)
      {
          if(a==arr[i])
          {
              c+=1;
          }
      }
      if(c>=1)
      {
          System.out.print("True");
      }
      else
      {
          System.out.print("False");
      }
  }
}