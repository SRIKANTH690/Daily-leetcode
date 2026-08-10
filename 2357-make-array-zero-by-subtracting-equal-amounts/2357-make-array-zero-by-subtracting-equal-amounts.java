class Solution {
    public int minimumOperations(int[] nums) {
        int n  = nums.length;
        // int [] res = new int[n];
        int count =0;

        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                continue;
            }


            boolean found = false;
            for(int j = 0;j<i;j++){
                if(nums[i] == nums[j]){
                    found  = true;
                    break;
                }
            }


            if(!found ){
                count++;
            }
        }
        return count;

    }
}