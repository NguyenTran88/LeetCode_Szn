import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelBSTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(); // bruh why can't new QUeue work
        List<Double> res = new ArrayList<>();
        if (root == null)
            return res;

        queue.add(root);
        while (queue.isEmpty() == false) {
            int size = queue.size();
            // List<Integer> currentLevel = new ArrayList<>();
            Double sum = 0.0;
            for (int i = 0; i < size; i++) {

                TreeNode curr = queue.remove();
                sum += curr.val;
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

            }
            res.add(sum / size);

        }

        return res;

    }

    class TreeNode {
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

}
