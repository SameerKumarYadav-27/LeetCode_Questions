class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int b = n*(n+1)/2;
        int c = 0;
        for(int num:nums) {
            c = c+num;
        }
        return b-c;
    }
}