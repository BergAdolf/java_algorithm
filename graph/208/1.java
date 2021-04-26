class Trie {
    TreeNode root;

    class TreeNode{
        boolean flag;
        TreeNode[] node;
        TreeNode(){
            flag = true;
            node = new TreeNode[26];
        }
    }
    /** Initialize your data structure here. */
    public Trie() {
        root = new TreeNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        
        TreeNode current = root;
        
        for(int i = 0; i < word.length(); i++){
            int n = word.charAt(i) - 'a';
            if(current.node[n] == null){
                current.node[n] = new TreeNode();
                current.node[n].flag = false;
            }

            current = current.node[n];
        }
        current.flag = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TreeNode current = find(word);
        return current != null && current.flag;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    public TreeNode find(String str){
        TreeNode current = root;
        for(int i = 0; i < str.length(); i++){
            int n = str.charAt(i) - 'a';
            if(current.node[n] == null){
                return null;
            }
            current = current.node[n];
        }
        return current;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */