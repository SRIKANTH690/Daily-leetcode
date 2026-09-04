// class Solution {
//     public int findFinalValue(int[] nums, int original) {

        // for(int i = 0;i<nums.length;i++){
        //     if(original != nums[i]){
        //         return original;
        //     }
        // }

        // for(int i=0;i<nums.length;i++){
        //     // int num = 1;
        //     if(original == nums[i]){
        //         original *=2;
        //         i = i -1;
        //     }
        // }
        // return original;
    //     }
    // }

// import java.util.HashSet;
// class Solution {
//     public int findFinalValue(int[] nums, int original) {

//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             set.add(num);
//         }

//         while (set.contains(original)) {
//             original = original * 2;
//         }

//         return original;
//     }
// }




class Solution {
    public int findFinalValue(int[] nums, int original) {


        while(true){
            boolean found = false;

            for(int num : nums){
                if( num == original){
                    found = true;
                    break;
                }
            }

            if(found){
                original *= 2;
            }else{
                break;
            }
        }
        return original;
    }
}



        
//     }
// }