package Solution.剑指offer;

import Solution.list_toarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Author: HK
 * Date:2018/12/11 15:40@Description:
 **/
public class j6_printList {
    public ArrayList<Integer> print1(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.empty()) {
            res.add(stack.pop());

        }
        return res;
    }

    //头插法
    public ArrayList<Integer> print2(ListNode listNode){
        ListNode newhead=new ListNode(1);
        while (listNode!=null){
            ListNode tmp=listNode;
            listNode.next=newhead.next;
            newhead.next=listNode;
            listNode=tmp.next;
        }
        ArrayList<Integer> res=new ArrayList<>();
        newhead=newhead.next;
        while (newhead!=null){
            res.add(newhead.next.val);
            newhead=newhead.next;
        }
        return res;
    }

    public static void main(String[] args) {
        j6_printList test = new j6_printList();
        ListNode a = new ListNode(1);
        a.next=new ListNode(2);
        a.next.next= new ListNode(7);
        a.next.next.next=new ListNode(9);

        System.out.println(test.print1(a));
        int [] b=new int []{1,2,3,4,5};
        System.out.println(Arrays.toString(new int []{1,2,3,4,5}));

    }
}

//  Arrays.toString(new int {})   #打印一维数组；
//  Arrays.deepToString(a2)

