class Solution {
    public int hammingDistance(int x, int y) {
        int flips=0;
        while(x!=0 || y!=0){
        if((x&1)!=(y&1))
        flips++;
        x>>=1;
        y>>=1;
        }
return flips;

    }
}