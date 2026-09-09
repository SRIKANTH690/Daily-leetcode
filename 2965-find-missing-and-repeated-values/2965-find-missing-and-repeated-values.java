class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;

        int [] count = new int[size+1];

        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                count[grid[i][j]]++;
            }
        }

        int miss = 0;
        int repeat = 0;

        for(int i =0;i<=size;i++){
            if(count[i] == 2){
                repeat = i;
            }

            if(count[i] == 0){
                miss = i;
            }
        }


        return new int[]{repeat , miss};
    }
}