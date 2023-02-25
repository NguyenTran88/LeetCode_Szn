import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC1161 {

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(); // bruh why can't new QUeue work
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return 0;

        queue.add(root);
        while (queue.isEmpty() == false) {
            int size = queue.size();
            int sum = 0;
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
            res.add(sum);

        }
        int maxindex = -1, maxval = Integer.MIN_VALUE;
        for (int i = 0; i < res.size(); i++) {

            int n = res.get(i);
            if (n > maxval) {
                maxval = n;
                maxindex = i + 1;
            }
        }
        return maxindex;
    }

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
