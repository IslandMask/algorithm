import java.util.*;
/*
 * 二叉树的层次遍历,展示二叉树每一层
 *
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LeetCode_102_36 {
      ArrayList<List<Integer>> levels = new ArrayList<List<Integer>>();

        public  void helper(TreeNode node, int level) {
            if (levels.size() == level)
                levels.add(new ArrayList<Integer>());

            List ll = levels.get(level);
            ll.add(node.val);

            if (node.left != null)
                helper(node.left, level + 1);
            if (node.right != null)
                helper(node.right, level + 1);
        }

        public  List<List<Integer>> levelOrder(TreeNode  root) {
            if (root == null) return levels;
            helper(root, 0);
            return levels;
        }

}
