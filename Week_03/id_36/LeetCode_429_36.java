/*

class Node {
    public int val;
    public List<Node> children;
    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
    N叉树的层序遍历
    [
     [1],
     [3,2,4],
     [5,6]
]
};
*/

public class LeetCode_429_36 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderUtil(root, result, 0);
        return result;
    }

    private void levelOrderUtil(Node root, List<List<Integer>> result, int level) {
        if (root == null)
            return;
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }
        List<Integer> l = result.get(level);
        l.add(root.val);
        for (Node next: root.children) {
            levelOrderUtil(next, result, level + 1);
        }
    }
}
