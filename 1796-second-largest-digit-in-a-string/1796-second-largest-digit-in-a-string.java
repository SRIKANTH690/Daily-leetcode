class Solution {
    public int secondHighest(String s) {
        int n  = s.length();
        int large  = -1;
        int second = -1;

        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
           
            if(ch >= '0' && ch <= '9'){
                int num = ch  -'0';

                if(num > large){
                    second = large;
                    large = num;
                }else if( num > second && num != large){
                    second= num;
                }
            }
        }

        return second;
     
        
    }
}