package Solution.剑指offer;

import java.util.List;

/**
 * Author: HK
 * Date:2019/3/5 10:08@Description:
 **/
public class j52_FindFirstCommonNode {

    public static ListNode FindFirstCommonNode(ListNode p1head, ListNode p2head) {
        ListNode l1 = p1head;
        ListNode l2 = p2head;
        while (l1 != l2) {
            l1 = (l1 == null) ? p2head : l1.next;
            l2 = (l2 == null) ? p1head : l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next .next= new ListNode(4);

        ListNode b = new ListNode(7);
        b.next = new ListNode(8);
        b.next.next = new ListNode(9);
        b.next.next.next = a.next.next;
        b.next.next.next.next=a.next.next.next;

        ListNode c = FindFirstCommonNode(a, b);
        System.out.println(c.val);

    }
}
