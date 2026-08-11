// class Solution {
//     public int mostFrequentEven(int[] nums) {
//         int n = nums.length;
//         int [] freq = new int[10001];
//         for(int num : nums){
//             if( num %2 == 0 ){
//                 freq[num]++;
//             }
//         }

//         int max = 0;
//         int ans = -1;

//         for(int i=0;i<=10000;i++){
//             if(freq[i] > max){
//                 max = freq[i];
//                 ans = i;
//             }
//         }
//         return ans;
        
//     }
// }

class Solution {
    public int mostFrequentEven(int[] nums) {

        int[] freq = new int[100001];

        for (int num : nums) {
            if (num % 2 == 0) {
                freq[num]++;
            }
        }

        int ans = -1;
        int max = 0;

        for (int i = 0; i <= 100000; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = i;
            }
        }

        return ans;
    }
}