import util.TreeNode;

/**
 * @Author chenk
 * @create 2020/12/7 8:40
 */
public class Q_104 {
    /**
     * Maximum Depth of Binary Tree
     *
     * Given the root of a binary tree, return its maximum depth.
     *
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *
     * Example 1:
     *
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     *
     * Example 2:
     *
     * Input: root = [1,null,2]
     * Output: 2
     * Example 3:
     *
     * Input: root = []
     * Output: 0
     * Example 4:
     *
     * Input: root = [0]
     * Output: 1
     *
     *
     * Constraints:
     *
     * The number of nodes in the tree is in the range [0, 104].
     * -100 <= Node.val <= 100
     */
    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

    public static void main(String[] args){
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode();
//        root.right = new TreeNode(2);
//        System.out.println(maxDepth(root));

        TreeNode root = new TreeNode(3);
        TreeNode l2L = new TreeNode(9);
        TreeNode l2R = new TreeNode(20);
        TreeNode l3L = new TreeNode(15);
        TreeNode l3R = new TreeNode(7);
        l2R.left = l3L;
        l2R.right = l3R;
        root.left = l2L;
        root.right = l2R;
        System.out.println(maxDepth(root));
    }
}
