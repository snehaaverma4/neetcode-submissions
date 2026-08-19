class Solution {
    public int maxArea(int[] heights) {
        int maxx=0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            int wd=r-l;
            int ht=Math.min(heights[l],heights[r]);
            int a=wd*ht;
            maxx=Math.max(a,maxx);
            if(heights[l]<=heights[r]){
                l++;

            }
            else{
                r--;
            }
        }
        
        return maxx;
    }
}
