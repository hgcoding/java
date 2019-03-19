package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/13 16:25@Description:
 **/
public class j8_treenode {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    /*
    1.右子树存在，寻找其最小左子树；
    2.右子树不存在，寻找父节点，满足为父节点的左子树；
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode.right!=null){
            TreeLinkNode node=pNode.right;
            while (node.left!=null){
                node=node.left;
            }
            return node;
        }
        while(pNode.next!=null){
            TreeLinkNode parent=pNode.next;
            if(parent.left==pNode)//中序遍历，满足父节点的左子节点为该节点，那么下一节点必为父节点
                return parent;
            pNode=pNode.next;
        }

        return null;
    }
}
