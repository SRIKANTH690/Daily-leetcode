class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int  m = magazine.length();
        int count =0;
        boolean [] found = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!found[j] && ransomNote.charAt(i) == magazine.charAt(j)){
                    count++;
                    found[j] = true;
                    break;
                }
            }
        }

        if(count == n){
            return true;
        }
        
        return false;
    }
}
