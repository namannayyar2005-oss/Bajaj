class Solution {
    private int remaining;
    private int result;

    public int kthSmallest(TreeNode root, int k) {
        remaining = k;
        result = -1;
        inorder(root);
        return result;
    }

    private void inorder(TreeNode node) {
        if (node == null || remaining == 0) {
            return;
        }

        inorder(node.left);

        remaining--;
        if (remaining == 0) {
            result = node.val;
            return;
        }

        inorder(node.right);
    }
}
