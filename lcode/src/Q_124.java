import util.TreeNode;

/**
 * @Author chenk
 * @create 2020/12/7 8:41
 */
public class Q_124 {
    /**
     * Binary Tree Maximum Path Sum
     * <p>
     * Given a non-empty binary tree, find the maximum path sum.
     * <p>
     * For this problem, a path is defined as any node sequence from some starting node to any node in the tree along the parent-child connections.
     * The path must contain at least one node and does not need to go through the root.
     * <p>
     * Example 1:
     * <p>
     * Input: root = [1,2,3]
     * Output: 6
     * <p>
     * Example 2:
     * <p>
     * Input: root = [-10,9,20,null,null,15,7]
     * Output: 42
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [0, 3 * 104].
     * -1000 <= Node.val <= 1000
     */

    static int maxValue;
    public static int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxValue = Math.max(maxValue, maxPathSum(root.left) + maxPathSum(root.right) + root.val);
        return maxValue;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        System.out.println(maxPathSum(root));
        TreeNode root = new TreeNode(-10);
        TreeNode l2L = new TreeNode(9);
        TreeNode l2R = new TreeNode(20);
        TreeNode l3L = new TreeNode(15);
        TreeNode l3R = new TreeNode(7);
        l2R.left = l3L;
        l2R.right = l3R;
        root.left = l2L;
        root.right = l2R;
        System.out.println(maxPathSum(root));
    }
}
