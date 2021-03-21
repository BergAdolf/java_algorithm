
//最好不用这种方法，list.remove和add会发生混淆，在多线程的情况下发生。
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 =  new ArrayList<>();;//表正在组合的列表
        List<Integer> list2 = new ArrayList<>();//表剩下的列表

        for (int num : nums) {
            list2.add(num);
        }
        searchForm(list, list1, list2);
        return list;

    }
    public void searchForm(List<List<Integer>> list, List<Integer> list1, List<Integer> list2){
        if(list2.isEmpty()){
            list.add(new ArrayList<>(list1));
            return;
        }
        int temp;
        int n = list2.size();
        for(int i = 0; i < n; i++){
            temp = list2.get(i);
            list1.add(temp);
            list2.remove(i);
            searchForm(list, list1, list2);
            list1.remove(list1.size() - 1);
            list2.add(i,temp);
        }
    }
}