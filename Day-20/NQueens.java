class Solution {

    private void solve(int col,char[][] board,int n,int[] leftRow,int[] lowerDiag,int[] upperDiag,List<List<String>> ans){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String (board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row = 0;row < n;row++){
            if(leftRow[row] == 0 && lowerDiag[row+col] == 0 && upperDiag[n-1 + col-row] == 0){
                
                board[row][col] = 'Q';

                leftRow[row] = 1;
                lowerDiag[row+col] = 1;
                upperDiag[n-1 + col-row] = 1;

                solve(col + 1,board,n,leftRow,lowerDiag,upperDiag,ans);

                board[row][col] = '.';

                leftRow[row] = 0;
                lowerDiag[row+col] = 0;
                upperDiag[n-1 + col-row] = 0;
            }
        }
        
    }

    public List<List<String>> solveNQueens(int n) {
       List<List<String>> ans = new ArrayList<>();
       char[][] board = new char[n][n];

       for(int i=0;i<n;i++){
        Arrays.fill(board[i],'.');
       }

        int[] leftRow = new int[n];
        int[] upperDiag = new int[2*n-1];
        int[] lowerDiag = new int[2*n-1];

        solve(0,board,n,leftRow,lowerDiag,upperDiag,ans);
        return ans;
    }
}
