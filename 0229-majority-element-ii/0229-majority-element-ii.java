class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        // int max = n /3;
        // int count = 1;
        int m = 0;
        for(int i=0;i<n;i++){
            boolean found = false;

            for(int x : ans){
                if(x == nums[i]){
                    found  = true;
                }
            }
            if(found){
                continue;
            }
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            // int count =0;

            if (count > n / 3) {
                ans.add(nums[i]);
            }
        }
        return ans;
        
    }
}