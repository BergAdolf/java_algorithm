class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();   //总的
        List<Integer>   combine = new ArrayList<>();    //合成中的目标列表
        Arrays.sort(candidates);
        list = dfs(candidates, list, combine, target, 0);
        return list;
    }

    public List<List<Integer>> dfs(int[] candidates, List<List<Integer>> list,List<Integer> combine,int target,int number){
        List<List<Integer>> list1;

        if(target < candidates[0])      //如果小于最小整数，则返回0
            return new ArrayList<List<Integer>>();

        if(0 == target){
            combine.add(candidates[number]);
            list.add(combine);
            return list;
        }
        
        for(int i = number; i < candidates.length; i++){
            combine.add(candidates[number]);
            list1 = dfs(candidates, list, combine, target - candidates[i],number);
            combine.remove(combine.size() - 1);
            if(list1.size() != 0)
            {
                list.addAll(list1);
            }    
        }
        return list;

    }
}