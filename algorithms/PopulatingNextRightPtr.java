/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class PopulatingNextRightPtr {
    public Node connect(Node root) {
        if(root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            Node prev = null;
            for(int i = 0; i < Math.pow(2, level); i++) {
                Node temp = queue.poll();
                if(temp.left != null) {
                   queue.add(temp.left); 
                }
                if(temp.right != null) {
                   queue.add(temp.right); 
                }
                if(prev != null) {
                    prev.next = temp;
                }
                prev = temp;
            }
            level++;
        }
        
        return root;
    }
}