class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for(int i=0 ;i<n;i++){
            if(nums[i] == target){
                int distance = Math.abs(i - start);
                min = Math.min(distance , min);
            }
        }


        return min;

        // int res = index - start;

        // return Math.abs(res);
        
    }
}