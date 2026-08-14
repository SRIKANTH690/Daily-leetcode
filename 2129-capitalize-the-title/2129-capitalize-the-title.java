class Solution {
    public String capitalizeTitle(String title) {
        int n = title.length();
       
        String [] words = title.split(" ");
        String res ="";

        for(int i=0;i<words.length;i++){
            String word = words[i].toLowerCase();

            if(word.length() >= 3){
                word = Character.toUpperCase(word.charAt(0))+word.substring(1);
            }
                res += word;
            
                if(i < words.length-1){
                    res+=" ";
                }
            }
        return res;
    }
}