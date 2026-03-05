import java.util.*;
public class Disjoint {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int ldr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ldr[i]=i;
        }
        for(int j=0;j<q;j++)
        {
            int lt=sc.nextInt();
            int rt=sc.nextInt();
            ldr[findldr(ldr,rt)]=findldr(ldr,lt);

        }
        for(int k=1;k<=n;k++)
        {
            System.out.print(findldr(ldr,k)+" ");
        }
    }
    public static int findldr(int []ldr,int node){
        if(node==ldr[node])
            return node;
        ldr[node]=findldr(ldr,ldr[node]);
        return ldr[node];
    }
}
