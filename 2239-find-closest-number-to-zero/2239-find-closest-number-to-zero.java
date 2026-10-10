class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){
            int a = nums[i];
            int b  = ans;

            if(a < 0) a=-a;
            if(b < 0) b = -b;

            if(a<b || (a==b && nums[i]>ans)){
                ans = nums[i];
            }
        }

        return ans;
        
    }
}