class Solution {
	//排序+hashmap
	//空间复杂度：O(nk)
	//时间复杂度：O(nklogk)
    public List<List<String>> groupAnagrams(String[] strs) {
    	
    	Map<String, List<String>> map = new HashMap<>();
    	for(int i = 0; i < strs.length; i++) {
    		char[] a = strs[i].toCharArray();
    		Arrays.sort(a);
    		String key = new String(a);
    		List<String> list = map.getOrDefault(key, new ArrayList<String>());
    		list.add(strs[i]);
    		map.put(key,list);  		
    	}
    	return new ArrayList<List<String>>(map.values());
    }
}