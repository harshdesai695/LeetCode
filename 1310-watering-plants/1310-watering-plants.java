class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step = 0;
        int tempCapacity = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= tempCapacity) {
                step++;
                tempCapacity -= plants[i];
            } else {
                step += (i * 2)+1;
                tempCapacity = capacity-plants[i];
            }
        }
        return step;
    }
}