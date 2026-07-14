class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for(String s : strs){
            boolean isnumber = true;

            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))){
                    isnumber = false;
                    break;
                }
            }

            int value;
            if(isnumber){
                value = Integer.parseInt(s);
            }else{
                value = s.length();
            }
          max = Math.max(max,value);
        }
        return max;
        
    }
}