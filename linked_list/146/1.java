
class LRUCache{
    
	
    private class TwoDirectionQueueNode{
    	int value;
    	int key;
    	TwoDirectionQueueNode next;
    	TwoDirectionQueueNode pre;
    	public TwoDirectionQueueNode(){}
    	public TwoDirectionQueueNode(int key, int value){
    		this.key = key;
    		this.value = value;
    	} 

    }
    private int capacity;
    private Map<Integer,TwoDirectionQueueNode> list = new HashMap<>();
    private TwoDirectionQueueNode first;
    private TwoDirectionQueueNode last;
    private int currentCapacity;

    public LRUCache(int capacity) {
    	this.currentCapacity = 0;
        this.capacity = capacity;
    	first = new TwoDirectionQueueNode();
    	last = new TwoDirectionQueueNode();
    	first.next = last;
    	last.pre = first;
    }

    public int get(int key) {
    	
    	TwoDirectionQueueNode node = list.get(key);
    	if(node == null)
    		return -1;

    	moveToFirst(node);
    	return node.value;

    }

    public void put(int key, int value) {
        TwoDirectionQueueNode node = list.get(key);
        if(node == null){
        	TwoDirectionQueueNode newNode = new TwoDirectionQueueNode(key, value);
        	list.put(key, newNode);
        	addToHead(newNode);
        	++currentCapacity;
        	if(currentCapacity > capacity){
        		TwoDirectionQueueNode tail = removeTail();
        		list.remove(tail.key);
        		--currentCapacity;
        	}
        }
        else{
        	node.value = value;
        	moveToFirst(node);
        }
    }

    private void addToHead(TwoDirectionQueueNode node){
    	node.pre = first;
    	node.next = first.next;
    	
    	first.next.pre = node;
    	first.next = node;
    }
    private void removeNode(TwoDirectionQueueNode node){
    	node.next.pre = node.pre;
    	node.pre.next = node.next;
    }
    //将结点移到头部
    public void moveToFirst(TwoDirectionQueueNode node){
    	removeNode(node);
    	addToHead(node);
    	
    }
    public TwoDirectionQueueNode removeTail(){
    	TwoDirectionQueueNode res = last.pre;
    	removeNode(res);
    	return res;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */