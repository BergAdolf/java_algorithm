class Solution {
    int[] visited;
    boolean isValid = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<Integer>());
        }
        visited = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++){
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for(int i = 0; i < numCourses; i++){
            if(visited[i] == 0){
                searchRoute(list, i);
            }
            if(!isValid){
                break;
            }
        }
        return isValid;
    }

    public void searchRoute(ArrayList<List<Integer>> list, int n){
        visited[n] = 1;
        List<Integer> l = list.get(n);
        for(int l1: l){
            if(visited[l1] == 1){
                isValid = false;
                return;
            }
            if(visited[l1] == 0){
                searchRoute(list, l1);
                if(!isValid){
                    return;
                }
            }
        }
        visited[n] = 2;
    }
}