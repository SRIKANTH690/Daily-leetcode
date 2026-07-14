class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = nums[n-1];
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += l;
            l = l+1;

        }
        return sum;
        
    }
}