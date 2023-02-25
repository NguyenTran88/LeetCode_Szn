import java.util.ArrayList;
import java.util.List;

public class LC113 {
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

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        path2(root, targetSum, new ArrayList(), result);
        return result;
    }

    void path2(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList<>(path));
        }
        path2(root.left, targetSum - root.val, path, result);
        path2(root.right, targetSum - root.val, path, result);
        if (result.isEmpty() == false) {
            result.remove(result.size() - 1);
        }

    }

}
