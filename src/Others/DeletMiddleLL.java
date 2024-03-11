package Others;

import java.util.Objects;

public class DeletMiddleLL {

    public static ListNode oddEvenList(ListNode head) {

        ListNode oddLinkList=new ListNode();
        ListNode evenLinkList=new ListNode();
        int count=0;
        ListNode tempEven=evenLinkList;
        ListNode tempOdd=oddLinkList;
        while(head!=null){
            if(count%2==0){
                tempEven.next =new ListNode(head.val);
                tempEven=tempEven.next;
                head=head.next;
            }else{
                tempOdd.next =new ListNode(head.val);
                tempOdd=tempOdd.next;
                head=head.next;
            }
            count++;
        }
        tempEven.next=oddLinkList.next;
        return evenLinkList.next;
    }


    public static ListNode reverseLinkedList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=new ListNode();
        while(head!=null){
            newNode.next=new ListNode(head.val,newNode.next);
            head=head.next;
        }
        return newNode.next;
    }

    public static ListNode removeMiddleElement(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode fast=head.next.next;
        ListNode slow=head;
        while(fast.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
            ListNode node=oddEvenList(head);
//        ListNode node=reverseLinkedList(head);
//        System.out.println(node);
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
    }
}
