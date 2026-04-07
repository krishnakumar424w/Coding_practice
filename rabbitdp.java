import java.util.*;
public class rabbitdp{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char grid[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j]=sc.next().charAt(0);
            }
        }
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='c')
                a[i][j]=1;
                else
                a[i][j]=0;
            }
        }
        int dp[][]=new int[n][m];
        dp[n-1][0]=a[n-1][0];
        for(int i=n-2;i>=0;i--)
        {
            dp[i][0]=Math.max(dp[i+1][0],dp[i+1][0]+a[i][0]);
        }
        for(int j=1;j<m;j++)
        {
            dp[n-1][j]=Math.max(dp[n-1][j-1],dp[n-1][j-1]+a[n-1][j]);
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=1;j<n;j++)
            {
               dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
               if(dp[i+1][j-1]>0)
               {
                continue;
               }
               if(a[i][j]==1&&a[i+1][j]!=1&&a[i][j-1]!=1)
                dp[i][j]+=1;
               else if(a[i][j]==1&&a[i+1][j]==1&&a[i][j-1]==1&&a[i+1][j-1]==1)
                dp[i][j]+=1;
            }
        }
        System.out.println(dp[0][n-1]);
    }
}