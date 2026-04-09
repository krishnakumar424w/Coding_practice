import java.util.*;
public class Factor {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    List<Integer>list =new ArrayList<>();
    for(int num=1;num*num<=N;num++)
    {
        if(N%num==0)
        {
            if(num==N/num)
                list.add(num);
            else
            {
                list.add(num);
                list.add(N/num);
            }
        }
    }
    Collections.sort(list);
    for(int i=0;i<list.size();i++)
    {
        System.out.printf("%d ",list.get(i));
    }
   } 
}
