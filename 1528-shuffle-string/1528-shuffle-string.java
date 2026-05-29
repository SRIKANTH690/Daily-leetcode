class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char [] res = new char[s.length()];

        for(int i=0;i<n;i++){
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}