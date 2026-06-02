class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans =0;

        for(int i=0;i<n;i++){
            int c =0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                    c++;
                    continue;
                }
            }

                if(c == 1){
                    ans = nums[i];
                    //return nums[i];
                }
            
        }
        return ans;

        
    }
}