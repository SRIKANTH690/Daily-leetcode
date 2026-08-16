class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        int count =1;
        int index =1;

        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count =1;
            }


            if(count <= k){
                nums[index] = nums[i];
                index++;
            }
        }
        int [] res = new int[index];

        for(int i=0;i<index;i++){
            res[i] = nums[i];
        }

        return res;

        
    }
}