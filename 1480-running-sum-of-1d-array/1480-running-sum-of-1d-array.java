// class Solution {
//     public int[] runningSum(int[] nums) {
//         int n = nums.length;

//         int [] res = new int[n];
//         res[0] = nums[0];

//         for(int i=1;i<n;i++){
//             res[i] = res[i-1] + nums[i];
//         }
        
//         return res;
//     }
// }


class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];
        res[0] = nums[0];

        for (int i = 0; i < n - 1; i++) {
            int sum = 0;

            for (int j = 0; j <= i + 1; j++) {
                sum = sum + nums[j];
            }

            res[i + 1] = sum;
        }

        return res;
    }
}