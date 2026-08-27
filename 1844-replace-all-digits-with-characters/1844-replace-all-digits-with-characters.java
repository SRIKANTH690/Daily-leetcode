class Solution {
    public String replaceDigits(String s) {
        int n = s.length();

        String res ="";

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch<= 'z'){
                res += ch;
            }else if( ch >= '0' && ch <= '9'){
                int digit = ch - '0';
                char prev = s.charAt(i-1);

                res += (char)(prev + digit);
            }
        }

        return res;
        
    }
}