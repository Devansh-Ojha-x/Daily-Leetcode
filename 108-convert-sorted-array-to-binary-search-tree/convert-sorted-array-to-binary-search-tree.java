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

     public TreeNode sortedArrayToBST(int[] nums) {
        int st=0;
        int end = nums.length-1;
        return  create_bst(nums,st,end);
        
    }

    public TreeNode create_bst(int[] nums,int st,int end){
        if(st>end){
            return null;
        }

        int mid=(st+end)/2;

        TreeNode root=new TreeNode(nums[mid]);

     root.left= create_bst(nums,st,mid-1);
        root.right=create_bst(nums,mid+1,end);
        return root;
    }


}