// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS
// https://leetcode.com/problems/n-queens/description/

class NQueens {
    List<List<String>> ans;
    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
        System.out.println(ans);
    }
    public List<List<String>> solveNQueens(int n) {
       char[][] chess=new char[n][n];
        
        for(char[] row:chess)
        {
            Arrays.fill(row,'.');
        }
        
       ans=new ArrayList<>();
      
        backTracking(chess,0,n);

       return ans;
    }
    
    public  void backTracking(char[][] chess,int row,int n)
    {
        if(row==n)
        {
            List<String> list=makeList(chess);
            ans.add(list);
            return;
        }
        
        for(int col=0;col<n;col++)
        {
            if(isSafePlace(chess,row,col))
            {
                chess[row][col]='Q';
                backTracking(chess,row+1,n);
                chess[row][col]='.';
            }
        }
    }
    
    public static boolean isSafePlace(char[][] chess,int row,int col)
    {
        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(chess[i][j]=='Q')
                return false;
        }
        
        //right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++)
        {
            if(chess[i][j]=='Q')
                return false;
        }
        
        for(int i=row-1;i>=0;i--)
        {
            if(chess[i][col]=='Q')
                return false;
        }
        
        return true;
    }
    public static List<String> makeList(char[][] arr)
    {
        List<String> list=new ArrayList<>();
        for(char[] mat:arr)
        {
            list.add(String.valueOf(mat));
        }
        
        return list;
    }
}