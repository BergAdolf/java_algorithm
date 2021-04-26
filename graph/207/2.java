class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<Integer>());
        }

        int[] nums = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
            nums[prerequisites[i][0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int n = queue.poll();
            List<Integer> l = list.get(n);
            for(int i = 0; i < l.size(); i++){
                nums[l.get(i)]--;
                if(nums[l.get(i)] == 0){
                    queue.offer(l.get(i));
                }
            }
        }
        
        for(int i: nums){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}