class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        long max = mass;
        Arrays.sort(a);
        for(int i = 0; i< a.length ; i++){
            if(max < a[i]){
                return false;
            }
            max += a[i];
        }

        return true;
        
        
    }
}