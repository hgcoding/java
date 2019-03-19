package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/24 17:03@Description:
 **/
public class j23_loopnode {
    public static class listnode{
        int val;
        listnode next;
        public void listnode(int val){
            this.val=val;
        }
    }
    public listnode  gofrist_loopnode(listnode head){
        if(head==null||head.next==null){
            return null;
        }
        listnode fast=head.next.next;
        listnode low=head.next;
        while (low==fast){
            fast=head.next.next;
            low=head.next;
        }
        while(head==low){
            head=head.next;
            low=low.next;
        }
        return low;
    }
}
