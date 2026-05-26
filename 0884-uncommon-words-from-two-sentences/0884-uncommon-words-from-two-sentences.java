class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String [] arr = (s1+ " "+s2).split(" ");
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count = 0 ;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count == 1){
                ans.add(arr[i]);
            }
        }

        return ans.toArray(new String[0]);
        
    }
}