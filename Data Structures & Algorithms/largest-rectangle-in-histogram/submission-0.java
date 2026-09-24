class Solution {
    public int largestRectangleArea(int[] heights) {
            Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int maxa=0;
        for (int i=0;i<=n;i++){
            int x=(i==n) ? 0 : heights[i];
            while(!st.isEmpty() &&  heights[st.peek()]>x){
                int h=heights[st.pop()];
                int w=(st.isEmpty()) ? i : i-st.peek()-1;
                int a=w*h;
                maxa=Math.max(a,maxa);
            }
            st.push(i);
        }
        return maxa;
    }
}
