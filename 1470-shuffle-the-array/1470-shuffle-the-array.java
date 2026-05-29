// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] arr1 = new int[n];
//         int [] arr2 = new int[n];
//         int [] res = new int[2*n];

//         for(int i=0;i<n;i++){
//             arr1[i] = nums[i]; 
//         }
//         for(int i=0;i<n;i++){
//             arr2[i]=nums[n+i];
//         }

//         for(int i=0;i<n;i++){
//             res[2*i] =arr1[i];
//             res[2*i+1] = arr2[i];
//         }
//         return res;

        
//     }
// }


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int[n+n];
        int index = 0;

        for(int i=0;i<n;i++){
            res[index++] = nums[i];
            res[index++] = nums[i+n];
        }
        return res;
    }
}