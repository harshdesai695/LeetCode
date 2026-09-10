class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for (int[] i : obstacles) {
            set.add(i[0] + "," + i[1]);
        }

        //Max distance we will return
        int maxDistance = 0;

        //Start Position
        int x = 0, y = 0;

        //Direction
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        //angle
        int angle=0;

        for (int i : commands) {
            if (i == -1) {
                angle = (angle + 1) % 4;
            } else if (i == -2) {
                angle = (angle + 3) % 4;
            } else {
                while(i-->0){
                    int newx = x + dir[angle][0];
                    int newy = y + dir[angle][1];

                    if (set.contains(newx + "," + newy)) {
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