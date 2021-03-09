class Solution {
	//栈
	//时间复杂度：O(n)，空间复杂度：O(n)
    public boolean isValid(String s) {
 		Deque<Character> stack = new ArrayDeque<>();

 		Map<Character,Character> map = new HashMap<>();
 		map.put('(',')');
 		map.put('[',']');
 		map.put('{','}');

 		for(int i = 0; i < s.length(); i++){
 			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
 				stack.addFirst(s.charAt(i));
 			}
 			else{
 				if(!stack.isEmpty() && map.get(stack.peekFirst()) == s.charAt(i)){
 					stack.removeFirst();

 				}else{
 					return false;
 				}
 			}
 		}
 		/*
        if(stack.isEmpty()){
            return true;
        }
 		else{
             return false;
         }
         */
         return stack.isEmpty();
    }
}