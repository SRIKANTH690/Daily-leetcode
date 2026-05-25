class Solution {
    public String reverseWords(String s) {
        String rev="";
        String word ="";
        int n=s.length();
        for(int i = 0 ; i<n;i++){
            char ch =s.charAt(i);

            if(ch != ' '){
                word+=s.charAt(i);
            }else{
                for(int j = word.length()-1;j>=0;j--){
                    rev += word.charAt(j);
                }
                rev+= ' ';
                word = "";
            }
        }
        for(int j=word.length()-1;j>=0;j--){
            rev += word.charAt(j);
        }
        return rev;
        
    }
}