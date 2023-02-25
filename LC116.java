
public class LC116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

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

    public Node connect(Node root) {
        return dfs(root, null);

    }

    public Node dfs(Node root, Node next) {
        if (root == null) {
            return null;
        }
        root.next = next;
        dfs(root.left, root.right);
        if (next != null) {
            dfs(root.right, root.next.left);
        }
        return root;

    }

}
