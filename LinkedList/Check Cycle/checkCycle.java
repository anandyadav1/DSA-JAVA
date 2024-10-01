
public class checkCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Check cycle LinkedList is exist
    public static boolean isCycle(){
        Node slow =head;
        Node fast =head;
        while (fast != null) {
            slow=slow.next;  //+1 moves
            fast=fast.next.next;  //+2 moves
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void print(){
        Node temp= head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    //Remove cycle
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast != null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow == fast) {
                cycle=true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        slow =head;
        Node prev =fast;
        while (fast != slow) {
            prev =fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;

    }

    public static void main(String[] args) {
        head=new Node(33);
        head.next=new Node(45);
        Node temp=new Node(87);
        head.next.next= temp;
        head.next.next.next=new Node(67);
        head.next.next.next.next=new Node(34);
        head.next.next.next.next.next=new Node(78);
        head.next.next.next.next.next.next=new Node(88);
        head.next.next.next.next.next.next.next=new Node(98);
        head.next.next.next.next.next.next.next.next=temp;
        // System.out.println(isCycle());/
        removeCycle();
        print();
    }

}
