class CustomStack {

    int[] st;
    int top = -1;

    public CustomStack(int maxSize) {
        st = new int[maxSize];
    }

    public void push(int x) {
        if (top >= st.length - 1) {
            return;
        }
        top++;
        st[top] = x;
    }

    public int pop() {
        if (top <= -1) {
            return -1;
        }
        int ret = st[top];
        st[top] = -1;
        top--;
        return ret;
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, top + 1);

        for (int i = 0; i < limit; i++) {
            st[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */