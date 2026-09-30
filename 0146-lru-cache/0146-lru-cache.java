class LRUCache {
    class Node{
        int val;
        int key;
        Node prev;
        Node next;

        public Node(int val, int key){
            this.val=val;
            this.key = key;
        }

    }

    Node head;
    Node tail;
    Map<Integer,Node> map;
    int capacity;
    
    public LRUCache(int capacity) {
        this.map = new HashMap();
        this.capacity = capacity;
        tail = new Node(0,0);
        head = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        putHead(node);
        return node.val;

    }
    
    public void put(int key, int value) { 
        if(map.containsKey(key)){
            Node temp = map.get(key);
            temp.val = value;
            putHead(temp);
        }
        else{
            Node newnode = new Node(value,key);
            map.put(key,newnode);
            addHead(newnode);

            if(map.size()>capacity){
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
        }
    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void addHead(Node node){
        node.next=head.next;
        node.next.prev=node;
        head.next =node;
        node.prev= head;

    }
    public void putHead(Node node){
        remove(node);
        addHead(node);
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna