class Solution {
    public int maximumCount(int[] nums) {
        int nu = nums.length;
        int p = 0;
        int n = 0;
        int z =0 ;
        int max = 0;

        for(int i=0;i<nu;i++){
            if(nums[i] > 0){
                p++;
            }else if(nums[i]  < 0){
                n++;
            }else{
                z++;
            }
        }
        max = Math.max(p,n);
        return max;
    }
}