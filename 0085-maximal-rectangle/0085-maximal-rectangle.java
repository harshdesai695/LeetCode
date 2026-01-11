class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int ans = 0;
        int[] heights = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != '0') {
                    heights[j] = heights[j] + 1;
                } else {
                    heights[j] = 0;
                }
            }
            int area = largestRectangleArea(heights);
            ans = Math.max(ans, area);
        }
        return ans;
    }

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