// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         int n = num.length;
//         ArrayList<Integer> res = new ArrayList<>();

//         int  nums = 0;
//         for(int i=0;i<n;i++){
//             nums = nums *10 + num[i];
//         }

//         nums = nums +k;
//         int temp = nums ;
//         int count =0;
//         while(temp > 0){
//             count++;
//             temp = temp /10;
//         }
//         int []ans  = new int[count];
//         for(int  i = count -1 ; i>=0 ;i--){
//             ans [i] = nums %10;
//             nums = nums/10;
//         }

//         for(int i=0;i<count;i++){
//             res.add(ans[i]);
//         }
//          return res;
//     }
// }



class Solution {
    public List<Integer> addToArrayForm(int[] num, int k){
        ArrayList<Integer> res = new ArrayList<>();

        int i = num.length - 1;
        while(i>=0 || k > 0){
            if(i>=0){
                k += num[i];
                i--;
            }
            res.add(k%10);
            k = k /10;
        }
        Collections.reverse(res);
        return res;
    }
}
