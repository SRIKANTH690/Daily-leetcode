class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > 2){
                return false;
            }
        }
        return true;
    }
}