class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        int count = 0;
        int maxDay = 0;

        for (int[] i : events) {
            maxDay = Math.max(maxDay, i[1]);
        }

        int n = events.length;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int y = 0;
        for (int i = 1; i <= maxDay; i++) {
            while (y < n && events[y][0] == i) {
                heap.offer(events[y][1]);
                y++;
            }

            while (!heap.isEmpty() && heap.peek() < i) {
                heap.poll();
            }

            if (!heap.isEmpty()) {
                heap.poll();
                count++;
            }

            if (y == n && heap.isEmpty()) {
                break;
            }
        }

        return count;

    }
}