package Solution.剑指offer;

import javax.swing.tree.TreeNode;

/**
 * Author: HK
 * Date:2018/11/30 9:39@Description:
 **/

public class j68_lowestCommonAncestor {
    public static class TreeNode{
        int val=0;
        TreeNode right=null;
        TreeNode left=null;
        TreeNode(int val){
            this.val=val;
        }
    }
    //二叉搜索树的公共祖先，左节点值<节点值<右节点值；
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return root;
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    /*二叉树的公共祖先,p和q都在树上，先搜索左树再搜索右树，最后判断：
    1.左树只找到一个并且右树没找到，左树的root就是祖先；left
    2.右树只找到一个并且左树没找到，右树的root就是祖先；right
    3.左右树各找到一个，最开始的root就是祖先；root
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root==p ||root==q)
            return root;
        TreeNode left=lowestCommonAncestor2(root.left, p, q);
        TreeNode right=lowestCommonAncestor2(root.left, p, q);
        return left==null?right:right==null?left:root;
        /*

        if(left!=null&&right==null)
                  return left;
          if(left==null&&right!=null)
                  return right;
          if(left!=null&&right!=null)
                  return root;

        */

    }
}
