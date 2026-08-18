class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0;
        StringBuilder ans=new StringBuilder();
        
        while(l<word1.length() || l<word2.length()){
            if(l<word1.length()){
                ans.append(word1.charAt(l));
            }
            if(l<word2.length()){
                ans.append(word2.charAt(l));
            }
            l++;
        }
        return ans.toString();
    }
}