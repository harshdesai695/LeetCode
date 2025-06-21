class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index;

        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
            default:
                throw new IllegalArgumentException("Invalid ruleKey");
        }

        return (int) items.stream().filter(
                item -> item.get(index).equals(ruleValue)).count();
    }
}