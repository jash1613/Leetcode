class MinStack {
       
       Stack<Integer> a;
    public MinStack() {
          a=new Stack<>();
    }
    
    public void push(int val) {
        a.push(val);
    }
    
    public void pop() {
        a.pop();
    }
    
    public int top() {
        return a.peek();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for (int i:a)
        {
            if(min>i)
            {
                min=i;
            }


        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */