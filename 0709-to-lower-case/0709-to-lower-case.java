class Solution {
    public String toLowerCase(String s) {
         char[] sameer=s.toCharArray();
        for (int i=0;i<sameer.length;i++)
            if('A'<= sameer[i] && sameer[i]<='Z')
        sameer[i]=(char) (sameer[i]-'A'+'a');
        return new String(sameer);
    }
}