import java.util.*;
public class Word_seacrch_skip1 {
    private static boolean dfs(char grid[][],String word,int idx,int R,int C,int r,int c,int skip,boolean v[][])
    {   v[r][c]=true;
        if(idx==word.length())
        {
            return true;
        }
        int dir[][]={{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        for(int i=0;i<8;i++)
        {
            int adjr=r+dir[i][0];
            int adjc=c+dir[i][1];
            if(adjr>=0&&adjr<R&&adjc>=0&&adjc<C&&!v[adjr][adjc])
            {
                if(grid[adjr][adjc]==word.charAt(idx))
                {
                    if( dfs(grid,word,idx+1,R,C,r,c,skip,v))
                        return true;
                }
                else if(skip==0&&idx+1<word.length()&&grid[adjr][adjc]==word.charAt(idx+1))
                { 
                    if(dfs(grid,word,idx+2,R,C,r,c,1,v))
                        return true;
                }

            }

        }
        v[r][c]=false;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char grid[][]=new char[R][C];
        for(int r=0;r<R;r++)
        {
            for(int c=0;c<C;c++)
            {
                grid[r][c]=sc.next().charAt(0);
            }
        }
        sc.nextLine();
        String word=sc.nextLine();
        boolean v[][]=new boolean[R][C];
        boolean ans=false;
        for(int r=0;r<R;r++)
        {
            for(int c=0;c<C;c++)
            { 
                if(grid[r][c]==word.charAt(0))
                {
                    v[r][c]=true;
                    ans=dfs(grid,word,1,R,C,r,c,0,v);
                    v[r][c]=false;
                }
                else if(grid[r][c]==word.charAt(1))
                {
                    v[r][c]=true;
                    ans=dfs(grid,word,2,R,C,r,c,1,v); 
                    v[r][c]=false;
                }
            }
        }
        if(ans)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
