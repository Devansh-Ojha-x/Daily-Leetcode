/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int count = 0;

    public int averageOfSubtree(TreeNode root) {
        count = 0;
        preorder(root);
        return count;
    }

    private void preorder(TreeNode node) {
        if (node == null) return;

        int sum = getSum(node);
        int totalNodes = getCount(node);

        if (sum / totalNodes == node.val) {
            count++;
        }

        preorder(node.left);
        preorder(node.right);
    }

    private int getSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getSum(node.left) + getSum(node.right);
    }

    private int getCount(TreeNode node) {
        if (node == null) return 0;
        return 1 + getCount(node.left) + getCount(node.right);
    }
}