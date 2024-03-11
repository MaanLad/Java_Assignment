package Others;


import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class LinkedListRemove {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null){
            head=head.next;
            return head;
        }
        if(head.next.next==null){
            if(n==1){
                head.next=null;
                return head;
            }else{
                return head.next;
            }
        }
        int count=0;
        while(fast!=null){
            if(count<n){
                fast=fast.next;
                System.out.println("Before fast find  fast:"+fast.val+" slow:"+slow.val);
            }else if(fast.next!=null) {
                fast = fast.next;
                slow = slow.next;
                System.out.println("After fast find  fast:" + fast.val + " slow:" + slow.val);
            }else{
                slow.next=slow.next.next;
                fast=null;
            }
            count++;
        }
        return head;
    }
    public static void main(String[] args) {
//        ListNode node7=new ListNode(7);
//        ListNode node6=new ListNode(6,node7);
//        ListNode node5=new ListNode(5,node6);
//        ListNode node4=new ListNode(4,node5);
//        ListNode node3=new ListNode(3,node4);
//        ListNode node2=new ListNode(2,node3);
//        ListNode node1=new ListNode(1,node2);
//        System.out.println(node1.next.val);
        ListNode head=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        ListNode node=removeNthFromEnd(head,2);
        System.out.println(node);
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
//        System.out.println();
//        System.out.println(removeNthFromEnd(head,1));
    }
}
