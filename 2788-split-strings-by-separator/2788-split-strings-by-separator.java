class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();

        for(String word : words){
            String temp = "";

            for(char ch : word.toCharArray()){
                if(ch == separator){
                    if(!temp.isEmpty()){
                        res.add(temp);
                        temp ="";
                        }
                    }else{
                        temp += ch;
                    }
                }
            if(!temp.isEmpty()){
                res.add(temp);
            }
        }
        return res;
    }
}