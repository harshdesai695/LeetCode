class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
		int n = matrix.length; // Row
		int m = matrix[0].length;// Column
		int r = m - 1, b = n - 1;
		int l = 0, t = 0;
		while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
				ans.add(matrix[t][i]);
			}
			t++;
			for (int i = t; i <= b; i++) {
				ans.add(matrix[i][r]);
			}
			r--;
			if (t <= b) {
				for (int i = r; i >= l; i--) {
					ans.add(matrix[b][i]);
				}
				b--;
			}
			if (l <= r) {
				for (int i = b; i >= t; i--) {
					ans.add(matrix[i][l]);
				}
				l++;
			}
		}
        return ans;
    }
}