public class LC129 {
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

    public int sumNumbers(TreeNode root) {
        int count = 0; //result
        String numbr = "";
        dfs(root, count, numbr);
        return count;

    }
    void dfs(TreeNode root, int count, String numbr){
        if(root == null){
            return;
        }
        numbr = numbr + root.val;
        if(root.left == null && root.right == null){
            count += Integer.parseInt(numbr);
        }
       
        dfs(root.left, count, numbr);
        
        dfs(root.right, count, numbr);
    }
}
