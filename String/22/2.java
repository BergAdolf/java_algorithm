class Solution {
    //回溯法
    //时间复杂度：O(4^(n) / sqrt(n))
    //空间复杂度：O(n)
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        searchBracket(list, n, new StringBuilder(),0,0);
        return list;
    }

    public void searchBracket(List<String> list, int n, StringBuilder s, int left, int right){
        if(s.length() == 2 * n){
            list.add(s.toString());
        }
        else{
            if(left < n){
                s.append('(');
    
                searchBracket(list, n, s, left + 1, right);
                s.deleteCharAt(s.length() - 1);
    
            }
            if(left > right){
                s.append(')');
      
                searchBracket(list, n, s, left, right + 1);
                s.deleteCharAt(s.length() - 1);
            }
        }

    }
}