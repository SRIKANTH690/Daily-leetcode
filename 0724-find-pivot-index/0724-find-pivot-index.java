class Solution {
    public int pivotIndex(int[] nums) {
          int n = nums.length;
        int totalsum = 0;

        for(int num : nums){
            totalsum += num;
        }
        int left = 0;

        for(int i=0;i<n;i++){
            int r = totalsum -left - nums[i];

            if(left == r){
                return i;
            }

            left += nums[i];
        }

        return -1;
        
    }
}