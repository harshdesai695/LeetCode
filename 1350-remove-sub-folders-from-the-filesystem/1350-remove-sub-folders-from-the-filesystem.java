class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);

        List<String> res = new ArrayList<>();
        res.add(folder[0]);

        for (int i = 1; i < folder.length; i++) {
            int folderLen = res.size() - 1;
            String lstFolder = res.get(folderLen) + "/";

            if (folder[i].startsWith(lstFolder)) {
                continue;
            } else {
                res.add(folder[i]);
            }
        }

        return res;
    }
}