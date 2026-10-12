class Solution {
    public int trailingZeroes(int n) {
        int sam = 0;
        while(n > 0) {
            n = n/5;
            sam += n;
        }
        return sam;
    }
}