class Solution {
    public boolean exist(char[][] board, String str) {
        int m = board.length;
        int n = board[0].length;
         
        char[] word = str.toCharArray();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == word[0]){
                    if(findWord(i,j,board,word,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean findWord(int i, int j, char[][] board, char[] word, int idx){
        int m = board.length;
        int n = board[0].length;
        if(idx == word.length) return true;
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]=='$') return false;
        if(board[i][j] != word[idx]) return false;

        char temp = board[i][j];
        board[i][j] = '$'; //in-place array ko change kra

        boolean ans = findWord(i-1,j,board,word,idx+1) ||
                      findWord(i+1,j,board,word,idx+1) ||
                      findWord(i,j-1,board,word,idx+1) ||
                      findWord(i,j+1,board,word,idx+1);


        board[i][j] = temp;

        return ans;
    }
}
