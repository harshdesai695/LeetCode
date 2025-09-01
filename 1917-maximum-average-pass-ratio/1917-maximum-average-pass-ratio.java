class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> {
            double profitA = (a[0] + 1) / (a[1] + 1) - a[0] / a[1];
            double profitB = (b[0] + 1) / (b[1] + 1) - b[0] / b[1];
            return Double.compare(profitB, profitA);
        });
        for (int[] c : classes) {
            maxHeap.offer(new double[]{ (double)c[0], (double)c[1] });
        }
        for (int i = 0; i < extraStudents; i++) {
            double[] bestClass = maxHeap.poll();
            bestClass[0]++;
            bestClass[1]++;
            maxHeap.offer(bestClass);
        }
        double totalRatioSum = 0.0;
        while (!maxHeap.isEmpty()) {
            double[] currentClass = maxHeap.poll();
            totalRatioSum += currentClass[0] / currentClass[1];
        }
        return totalRatioSum / classes.length;
    }
}