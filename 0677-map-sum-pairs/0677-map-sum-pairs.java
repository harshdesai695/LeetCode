class MapSum {
    HashMap<String,Integer> map = new HashMap<>();

    public MapSum() {
        
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum=0;
        for(String str:map.keySet()){
            if(str.startsWith(prefix)){
                sum=sum+map.get(str);
            }   
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */