class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obs = new HashSet<>();
        for (int[] i : obstacles) {
            obs.add(i[0] + "," + i[1]);
        }

        int x = 0, y = 0;
        int angle = 0;
        int maxDistance = 0;
        int[][] directions = {
                { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }
        };

        for (int cmd : commands) {
            if (cmd == -2) {
                angle = (angle + 3) % 4;
            } else if (cmd == -1) {
                angle = (angle + 1) % 4;
            } else {
                while (cmd-- > 0) {
                    int newx = x + directions[angle][0];
                    int newy = y + directions[angle][1];

                    if (obs.contains(newx + "," + newy)) {
                        break;
                    }
                    x = newx;
                    y = newy;
                    maxDistance = Math.max(maxDistance, x * x + y * y);
                }
            }
        }
        return maxDistance;
    }
}