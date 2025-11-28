class Solution {
    public int largestRectangleArea(int[] heights) {

        ArrayList<Integer> nsl = nearestSmallerLeft(heights);
        ArrayList<Integer> nsr = nearestSmallerRight(heights);
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = nsr.get(i) - nsl.get(i) - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

    }

    public ArrayList<Integer> nearestSmallerLeft(int[] heights) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<int[]> st = new Stack<int[]>();
        int pseudoIndex = -1;
        for (int i = 0; i < heights.length; i++) {
            if (st.size() == 0) {
                res.add(pseudoIndex);
            }

            else if (st.size() > 0 && st.peek()[0] < heights[i]) {
                res.add(st.peek()[1]);
            } else if (st.size() > 0 && st.peek()[0] >= heights[i]) {
                while (st.size() > 0 && st.peek()[0] >= heights[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    res.add(pseudoIndex);
                } else {
                    res.add(st.peek()[1]);
                }
            }
            st.push(new int[] { heights[i], i });
        }
        return res;
    }

    public ArrayList<Integer> nearestSmallerRight(int[] heights) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<int[]> st = new Stack<int[]>();
        int pseudoIndex = heights.length;
        for (int i = heights.length - 1; i >= 0; i--) {
            if (st.size() == 0) {
                res.add(pseudoIndex);
            }

            else if (st.size() > 0 && st.peek()[0] < heights[i]) {
                res.add(st.peek()[1]);
            } else if (st.size() > 0 && st.peek()[0] >= heights[i]) {
                while (st.size() > 0 && st.peek()[0] >= heights[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    res.add(pseudoIndex);
                } else {
                    res.add(st.peek()[1]);
                }
            }
            st.push(new int[] { heights[i], i });
        }
        Collections.reverse(res);
        return res;
    }
}