import java.util.LinkedList;
import java.util.Queue;

/**
 * LC226
 */
public class LC226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                
                if(curr.left !=null){
                    queue.add(curr.left);
                }
                if(curr.right !=null){
                    queue.add(curr.right);
                }
            }

        }
        

        
    }
    
}