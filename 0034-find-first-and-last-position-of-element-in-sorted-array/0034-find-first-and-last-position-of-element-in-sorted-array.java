class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int findex = -1;
        int lindex = -1;
      //  ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n;i++){
            if(nums[i] == target){
                if(findex == -1){
                    findex = i;
                }

                lindex = i;
            }
        }
        return new int[]{findex , lindex};
        
    }
}