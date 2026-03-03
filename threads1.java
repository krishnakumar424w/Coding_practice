import java.util.*;
class Demo extends Thread
{
    int id;
    int n;
    Demo(int id,int n)
    {
        this.id=id;
        this.n=n;
    }
    public void run()
    {
       for(int i=0;i<n;i++)
       {
         System.out.printf("id: %d thread: %d\n",id,i);
       }
    }
}
public class threads1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            Demo d1=new Demo(i,n);
            d1.start();
        }
    }
}
