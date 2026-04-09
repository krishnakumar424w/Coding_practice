import java.util.*;
public class Longest_common_substring {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int R=s1.length();
        int C=s2.length();
        int dp[][]=new int[R-1][C-1];
        int ans=0;
        for(int row=1;row<=R;row++)
        {
            for(int col=1;col<=C;col++)
            {
                if(s1.charAt(row-1)==s2.charAt(col-1))
                {
                    dp[row][col]=dp[row-1][col-1]+1;
                    ans=Math.max(dp[row][col],ans);
                }
            }
        }
         for(int row=1;row<=R;row++)
        {
            for(int col=1;col<=C;col++)
            {
                   if(ans==dp[row][col])
                   {
                      System.out.println(s1.substring(row-ans,row));
                   } 
            }
        }

    }
}
