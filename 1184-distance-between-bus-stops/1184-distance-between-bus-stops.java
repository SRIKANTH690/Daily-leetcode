class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;

        int f = 0;
        int b = 0;

        int i = start;
        while(i != destination){
            f += distance[i];
            i = (i+1) % n;
        }

        int total =0;
        for(int x : distance){
            total+=x;
        }

        b = total - f;

        return Math.min(f,b);
        
    }
}