class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;

        int [] count = new int[101];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }

        int max = 0;
        for(int i=0;i<count.length;i++){
            if(count[i] > max){
                max = count[i];
            }
        }
        int res = 0;

        for(int i=0;i<count.length;i++){
            if(count[i] == max ){
                res += count[i];
            }
        }
        return res;
        
    }
}