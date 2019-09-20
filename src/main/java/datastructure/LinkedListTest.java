package datastructure;


import support.LinkedNode;

public class LinkedListTest {

    public void getSize(LinkedNode root){
        int count = 1;
        while(root.next != null) {
            count++;
            root = root.next;
        }
        System.out.println(count);
    }

    public void findMidNode(LinkedNode root){
        LinkedNode fast = root;
        LinkedNode slow = root;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.toString());
    }

    public void isMerge(LinkedNode root){
        LinkedNode fast = root;
        LinkedNode slow = root;
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while(fast.next != slow.next && fast.next!=null);

        System.out.println(slow == fast);
    }

    public void findMergePoint(LinkedNode root){
        LinkedNode fast = root;
        LinkedNode slow = root;
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while(fast.next != slow.next && fast.next!=null);

        if(slow != fast){
            System.out.println("No merge point.");
        }else{
            LinkedNode newSlow = root;
            LinkedNode newFast = root;
//            while()

        }
    }

    public static void main(String[] args) {
        LinkedNode root = new LinkedNode(5);
        root.next = new LinkedNode(4);
        root.next.next = new LinkedNode(3);
        root.next.next.next = new LinkedNode(2);
        root.next.next.next.next = new LinkedNode(1);
        LinkedListTest linkedList = new LinkedListTest();
        linkedList.getSize(root);
        linkedList.findMidNode(root);
        linkedList.isMerge(root);
    }
}
