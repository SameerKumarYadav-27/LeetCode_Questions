class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
			return false;
		}
		
		int[] freq = new int[26];
		
		for(int i=0; i<s.length();i++) {
			char ch1 =Character.toLowerCase(s.charAt(i));
			char ch2=Character.toLowerCase(t.charAt(i));
			
			freq[ch1-'a']++;
			freq[ch2-'a']--;
			
		}
		for(int i=0;i<26;i++) {
			if(freq[i]!=0) {
				return false;
			}
		}
		
		return true;
    }
}