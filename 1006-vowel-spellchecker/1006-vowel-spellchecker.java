class Solution {

    HashSet<String> exactMap = new HashSet<>();
    HashMap<String, String> cMap = new HashMap<>();
    HashMap<String, String> vMap = new HashMap<>();

    public String[] spellchecker(String[] wordlist, String[] queries) {

        for (String word : wordlist) {
            exactMap.add(word);

            String lword = word.toLowerCase();
            cMap.putIfAbsent(lword, word);

            String vword = word.toLowerCase().replaceAll("[aeiou]", "*");
            vMap.putIfAbsent(vword, word);
        }

        return checkQueries(queries);
    }

    public String[] checkQueries(String[] queries) {
        String ans[] = new String[queries.length];
        int idx = 0;
        for (String query : queries) {
            ans[idx] = check(query);
            idx++;
        }
        return ans;
    }

    public String check(String query){
        if(exactMap.contains(query)){
            return query;
        }

        if(cMap.containsKey(query.toLowerCase())){
            return cMap.get(query.toLowerCase());
        }
        String queryWord = query.toLowerCase().replaceAll("[aeiou]", "*");
        if(vMap.containsKey(queryWord)){
            return vMap.get(queryWord);
        }

        return "";
    }
}