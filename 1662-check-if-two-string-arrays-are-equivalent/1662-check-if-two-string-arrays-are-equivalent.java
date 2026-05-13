class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res ="";
        for(int i=0;i<word1.length;i++){
            res+= word1[i];
        }   
        String res1 = "";
        for(int i=0;i<word2.length;i++){
            res1+= word2[i];
        }

        return (res.equals(res1));
    }
}