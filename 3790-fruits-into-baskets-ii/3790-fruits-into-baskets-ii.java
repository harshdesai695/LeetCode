class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int[] visBasket = new int[baskets.length];
        Arrays.fill(visBasket, -1);
        int remainingFruits=0;

        for (int i = 0; i < fruits.length; i++) {
            boolean placed=false;
            for (int j = 0; j < baskets.length; j++) {
                if(visBasket[j]==-1 && baskets[j]>=fruits[i]){
                    visBasket[j]=i;
                    placed=true;
                    break;
                }
            }
            if(!placed){
                remainingFruits++;
            }
        }
        return remainingFruits;
    }
}