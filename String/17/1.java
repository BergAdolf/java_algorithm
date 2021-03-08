class Solution {
    public List<String> letterCombinations(String digits) {
    	List<String> combine = new ArrayList<>();

    	if(digits.length() < 1)
    		return combine;

    	Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		backTrack(combine, map, digits, 0, new StringBuffer());

    }
    public List<String> backTrack(List<String> combine, Map<Character, String> map, String digits, int index, StringBuffer combines){
    	if(index == digits.length()){
    		return combine.add(combines.toString());
    	}
    	else{
    		char digit = digits.chatAt(index);
    		String s = map.get(digit);
    		int count = s.length();

    		for(int i = 0; i < count; i++){
    			combines.append(s.chatAt(i));
    			backTrack(combine, map, digits, index + 1, combines);
    			combine.deleteCharAt(index);
    		}
    	}

    }
}