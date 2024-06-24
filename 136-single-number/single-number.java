class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for (int i : nums) {
          res^=i;
        }
        return res; // return the single element in the set
    }
}