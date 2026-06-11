class Solution {
    public int[] findErrorNums(int[] nums) {
        int n  = nums.length;
        int [] res = new int[2];

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                count++;
            }
        }
        if(count == 2){
            res[0] = nums[i];
            break;
            }
        }


        int total = n * (n+1) / 2;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int miss = res[0]+(total - sum);
        res[1] = miss;
        return res;
    }
}