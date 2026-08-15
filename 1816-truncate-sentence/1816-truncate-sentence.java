class Solution {
    public String truncateSentence(String s, int k) {
        int n =s.length();
        // String res = "";
        int count = 0;
        int end = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == ' '){
                count++;
            }


            if(count == k){
                end = i;
                break;
            }
        }
        if(count  < k){
            return s;
        }
        return s.substring(0,end);        
    }
}



// class Solution {
//     public String truncateSentence(String s, int k) {

//         int count = 0;

//         for (int i = 0; i < s.length(); i++) {

//             if (s.charAt(i) == ' ') {
//                 count++;

//                 if (count == k) {
//                     return s.substring(0, i);
//                 }
//             }
//         }

//         return s;
//     }
// }   