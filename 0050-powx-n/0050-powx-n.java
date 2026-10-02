class Solution {
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        double power = Math.pow(x, n);
        return power;
    }
}