import java.util.*;
public class Minheap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        Queue<Integer>q=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            q.offer(a[i]);
        }
        int cost=0;
        while(q.size()>1)
        {
            int n1=q.poll();
            int n2=q.poll();
            cost+=(n1+n2);
            q.offer(n1+n2);
        }
        
        System.out.print(cost);
    }
}
