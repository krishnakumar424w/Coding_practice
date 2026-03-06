import java.util.*;
public class Subarray_sum
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int l=0,r=0;
    int c=0,s=0;
    while(l<n&&r<n)
    {
       if(s>k)
      {
        s-=a[l];
        l++;
      }
      else{
        s+=a[r];
        r++;
      }

      if(s==k)
        c++;
    }
    System.out.println(c);
}
}