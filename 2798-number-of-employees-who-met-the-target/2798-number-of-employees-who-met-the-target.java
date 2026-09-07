class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int c =0;

        for(int x : hours){
            if(x >= target){
                c++;
            }
        }

        return c;
    }
}