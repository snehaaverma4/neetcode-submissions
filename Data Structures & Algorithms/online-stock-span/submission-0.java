class StockSpanner {

    Stack<int[]> st;
    int idx;
    public StockSpanner() {
        st=new Stack<>();
        idx=-1;
    }
    
    public int next(int price) {
        idx+=1;
        int span=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            st.pop();
        }
        if(st.isEmpty()) span=idx+1;
        else span=idx-st.peek()[1];
        st.push(new int[]{price,idx});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */