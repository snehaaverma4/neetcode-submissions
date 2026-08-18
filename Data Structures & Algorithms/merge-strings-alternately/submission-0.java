class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=Math.max(word1.length(),word2.length());
        int l=0;
        StringBuilder ans=new StringBuilder();
        
        while(l<n){
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