class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> valToIndex;
    Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        valToIndex = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        valToIndex.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        int indexToRemove = valToIndex.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(indexToRemove, lastElement);
        valToIndex.put(lastElement, indexToRemove);
        list.remove(list.size() - 1);
        valToIndex.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */