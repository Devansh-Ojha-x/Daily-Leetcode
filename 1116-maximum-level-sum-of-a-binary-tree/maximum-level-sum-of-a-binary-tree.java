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
    public int maxLevelSum(TreeNode root) {
      if(root==null){
        return 0;
      }
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      q.add(null);
      int c=0;
      int max=Integer.MIN_VALUE;
      int ans=1;
      int level=1;

      while(!q.isEmpty()){
        TreeNode curr=q.remove();
        if(curr==null){

            if(c > max){
                max=c;
                ans=level;
            }

            if(q.isEmpty()){
             break;
            }
            else{
                q.add(null);
                c=0;
                level++;
            }
        }
        else{

            c+=curr.val;
            
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }

        }
      }

      return ans;
    }
}