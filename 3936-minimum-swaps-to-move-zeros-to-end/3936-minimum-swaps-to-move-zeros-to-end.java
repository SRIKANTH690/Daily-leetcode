// class Solution {
//     public int minimumSwaps(int[] nums) {
//         int n = nums.length;

//         int lastn = -1;

//         for(int i = n-1 ;i >= 0 ;i--){
//             if(nums[i] != 0){
//                 lastn =  i;
//                 break;
//             }
//         }
//         if(lastn == -1){
//             return 0;
//         }
//         int count = 0 ;

//         for(int i=0;i<lastn ;i++){
//             if(nums[i] == 0){
//                 count++;
//             }
//         }
//         return count;
        
//     }
// }



class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int count =0;
        int j = n-1;
        for(int i=0;i<n;i++){
            if(nums[i] == 0 ){
                while(j >i && nums[j] == 0){
                    j--;
                }
                if(j > i ){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    count++;
                    j--;
                }
            }
        }
        return count;
    }
}