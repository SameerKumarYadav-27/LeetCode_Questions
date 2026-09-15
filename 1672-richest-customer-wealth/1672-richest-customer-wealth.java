class Solution {
    public int maximumWealth(int[][] accounts) {
     
       int maximumWealth=0;
        for(int i=0; i<accounts.length; i++) {
       int rowSum=0;
       for(int j=0; j<accounts[i].length; j++) {
        rowSum += accounts[i][j]; 
       }
        maximumWealth=Math.max(maximumWealth, rowSum);
        }
        return maximumWealth;

        }
    }
