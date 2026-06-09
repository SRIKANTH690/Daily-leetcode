class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int single =0;
        int dou = 0;
        for(int num : nums){
            if(num < 10){
                single += num;
            }else{
                dou+= num;
            }
        }
        if(single == dou){
            return false;
        }
        return true;
 
        
    }
}