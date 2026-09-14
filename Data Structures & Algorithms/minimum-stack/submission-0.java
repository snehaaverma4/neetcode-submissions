class MinStack {
    Stack<Long> st;
    long minn=Long.MAX_VALUE;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        long val=value;
        if(st.isEmpty()){
            st.push(val);
            minn=val;
        }
        else{
            if(val>=minn){
                st.push(val);
            }
            else{
                st.push(2*val-minn);
                minn=val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        else{
            long n=st.pop();
            if(n<minn){
                minn=2*minn-n;
            }
        }
        
    }
    
    public int top() {
        long top=st.peek();
        if(top<minn) return (int) minn;
        return (int) top;
    }
    
    public int getMin() {
        return (int) minn;
    }
}
