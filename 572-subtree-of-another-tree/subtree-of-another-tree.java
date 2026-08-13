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
    public static boolean isIdentical(TreeNode root, TreeNode subRoot){
     if(root==null&&subRoot==null){
        return true;
     }
    else if(root==null || subRoot==null || root.val!=subRoot.val){
        return false;
    }

    if(!isIdentical(root.left,subRoot.left)){
        return false;
    }

    if(!isIdentical(root.right,subRoot.right)){
        return false;
    }
    return true;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
        return true;
    }
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        boolean leftans=isSubtree(root.left,subRoot);
        boolean rightans=isSubtree(root.right,subRoot);

        return leftans||rightans;

    }
}