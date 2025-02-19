class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            if(stack.isEmpty()){
                // ans[i]=-1;
                map.put(nums2[i],-1);
            }
            else if(stack.size()>0 && stack.peek()>nums2[i]){
                // ans[i]=stack.peek();
                map.put(nums2[i],stack.peek());
            }
            else if(stack.size()>0 && stack.peek()<=nums2[i]){
                while(stack.size()>0 && stack.peek()<=nums2[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    // ans[i]=-1;
                    map.put(nums2[i],-1);
                }else{
                    // ans[i]=stack.peek();
                    map.put(nums2[i],stack.peek());
                }
            }
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}