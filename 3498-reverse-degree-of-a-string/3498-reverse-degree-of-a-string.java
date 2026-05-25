class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
      //  char[]ch = new int[s.length]
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int value = 26 - (ch - 'a');

            sum  =sum +  value *(i+1);
        }
        return sum;
    }
}