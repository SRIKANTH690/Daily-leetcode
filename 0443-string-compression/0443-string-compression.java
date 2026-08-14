// class Solution{
// public int compress(char[] chars) {
//     String res = "";
//     int count = 1;

//     for(int i = 0; i < chars.length(); i++){
//         if(i + 1 < chars.length() &&
//            chars.charAt[i] == chars.charAt[i + 1]) {
//             count++;
//         } else {
//             res += chars.charAt[i];
//             if(count > 1){
//                 res += count;
//             }
//             count = 1;
//         }
//     }
//          for (int i = 0; i < res.length(); i++) {
//             arr[i] = res.charAt(i);
//         }
//         return res.length();
//     }
// }



class Solution {
    public int compress(char[] arr) {

        String res = "";
        int count = 1;

        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
            } 
            else {

                res += arr[i];

                if (count > 1) {
                    res += count;
                }

                count = 1;
            }
        }

        for (int i = 0; i < res.length(); i++) {
            arr[i] = res.charAt(i);
        }

        return res.length();
    }
}