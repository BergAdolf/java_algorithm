//单端队列
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1){
            return nums;
        }
        
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }
            queue.offerLast(i);
        }

        int[] ans = new int[nums.length - k + 1];
        ans[0] = nums[queue.peekFirst()];
        
        for(int i = k; i < nums.length; i++){
            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }
            queue.offerLast(i);
            while(queue.peekFirst() <= i - k){
                queue.pollFirst();
            }
            ans[i - k + 1] = nums[queue.peekFirst()];
        }
        return ans;
    }
}