class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        int p=x;
        int z=0;
        while(x!=0) {
            int digit = x%10;
            z=z*10+digit;
            x=x/10;
        }
        return p==z;

    }
}