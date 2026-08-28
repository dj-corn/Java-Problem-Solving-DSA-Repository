class Solution {
    public int oddCells(int m, int n, int[][] ind) {
        int [][]arr = new int[m][n];
        for(int i=0; i<ind.length; i++){
            int a = ind [i][0];
            int b = ind [i][1];
            for(int j=0; j<n; j++){
                arr[a][j]++;
            }
            for(int j=0; j<m; j++){
                arr[j][b]++;
            }
        }
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}