class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for(int num : nums){
            int sum=0;

            while(num >0 ){
                sum += num%10;
                num = num /10;
            }
            ans = Math.min(sum,ans);
        }
        return ans;
    }
}