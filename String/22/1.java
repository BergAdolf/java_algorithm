class Solution {
    //递归法
    //时间复杂度：O(2^(2n) * n)
    //空间复杂度：O(n)
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        searchBracket(list, 2 * n, new StringBuilder(),0);
        return list;
    }

    public void searchBracket(List<String> list, int n, StringBuilder s, int k){
    	if(n == k){
    		if(isCombination(s))  //除了记录也要删除
    			list.add(s.toString());
    	}
    	else{
    		s.append('(');
	    	searchBracket(list, n, s, k + 1);
	    	s.deleteCharAt(k);
	    	s.append(')');
	    	searchBracket(list, n, s, k + 1);
	    	s.deleteCharAt(k);
    	}

    }
    public Boolean isCombination(StringBuilder s){
    	int left = 0, right = 0;

    	for(int i = 0; i < s.length(); i++){
    		if(s.charAt(i) == '('){
    			left++;
    		}else{
    			right++;
    		}
    		if(left < right){
    			return false;
    		}
    	}
    	return (left == right); 

    }
}