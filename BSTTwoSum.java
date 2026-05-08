import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> values = new HashSet<>();
        return containsPair(root, k, values);
    }

    private boolean containsPair(TreeNode node, int k, Set<Integer> values) {
        if (node == null) {
            return false;
        }

        if (values.contains(k - node.val)) {
            return true;
        }

        values.add(node.val);

        return containsPair(node.left, k, values) || containsPair(node.right, k, values);
    }
}
