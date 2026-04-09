import java.util.*;
public class NextMax {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        Stack<Integer>st=new Stack<>();
        int b[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
                while(!st.isEmpty()&&st.peek()<=a[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    b[i]=a[i];
                }
                else{
                    b[i]=st.peek();
                }
               
                   st.push(a[i]);  
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}
