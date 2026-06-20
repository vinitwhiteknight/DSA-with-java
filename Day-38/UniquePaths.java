//mathematical approch
public class Solution {
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int i = 1; i <= m - 1; i++) {
            ans = ans * (n - 1 + i) / i;
        }
        return (int)ans;
    }
}
//different approach
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[] aboveRow = new int[n];
//         Arrays.fill(aboveRow, 1);

//         for (int row = 1; row < m; row++) {
//             int[] currentRow = new int[n];
//             Arrays.fill(currentRow, 1);
//             for (int col = 1; col < n; col++) {
//                 currentRow[col] = currentRow[col - 1] + aboveRow[col];
//             }
//             aboveRow = currentRow;
//         }

//         return aboveRow[n - 1];        
//     }
// }
