package Solution.剑指offer;

import java.util.List;

/**
 * Author: HK
 * Date:2018/12/21 10:53@Description:
 **/
public class j18_dellistnode {
    public static class ListNode{
        int val;
        ListNode next;
        public void ListNode(int val){
            this.val=val;
        }

    }
    public  static ListNode dellistnode(ListNode head , ListNode todel){
        if(head==null ||todel==null){
            return null;
        }
        if(todel.next!=null){
            todel.val=todel.next.val;
            todel.next=todel.next.next;
        }
        else{
            ListNode pre_todel=head;
            while(pre_todel.next!=todel){
                pre_todel=pre_todel.next;
            }
            head.next=null;
        }
        return head;

    }
}
