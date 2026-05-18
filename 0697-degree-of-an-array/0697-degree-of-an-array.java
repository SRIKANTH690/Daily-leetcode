class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = Integer.MAX_VALUE, maxFreq = 0;
        List<Integer> lst = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0) + 1);
            if(mp.get(nums[i]) > maxFreq){
                maxFreq = mp.get(nums[i]);
                lst = new ArrayList<>();
            }
            if(mp.get(nums[i])==maxFreq) lst.add(nums[i]);
        }
        for(int i=0; i < lst.size(); i++){
            int left = 0, right = 0;
            for(int m=0; m < nums.length; m++){
                if(nums[m]==lst.get(i)){
                    left = m;
                    break;
                }
            }
            for(int m=nums.length -1; m > -1 ; m--){
                if(nums[m]==lst.get(i)){
                    right = m;
                    break;
                }
            }
            if(degree > right - left + 1) degree = right - left + 1;
        }
        return degree;
    }
}