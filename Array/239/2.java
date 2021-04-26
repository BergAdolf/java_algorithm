//最小堆
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1){
            return nums;
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>(){//()忘记加
            public int compare(int[] o1, int[] o2){//int返回值
                return o1[0] != o2[0]? o2[0] - o1[0]:o2[1] - o1[1];//默认是最小堆
            }        
        });//忘记加引号
            
        for(int i = 0; i < k; i++){
            queue.offer(new int[]{nums[i], i});
        }

        int[] ans = new int[nums.length - k + 1];
        ans[0] = queue.element()[0];
        for(int i = k; i < nums.length; i++){
            queue.offer(new int[]{nums[i], i});
            while(!queue.isEmpty() && queue.peek()[1] <= i - k){
                queue.poll();
            }
            ans[i - k + 1] = queue.peek()[0];
        }
        return ans;
    }
}