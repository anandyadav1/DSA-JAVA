public class Reverse {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // By default null initialized
    public static Node tail; // By default null initialized
    public static int size; // By default zero(0) initialized

    // addFirst method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast method (Implementing it)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add any given position
    public void addIndex(int data, int idx) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // printFunction method
    public static void printFuntion() {
        if (head == null) {
            System.out.println("LinkedList is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Delete Element From End side by given position
    public int deletNthEndSide(int n) {   //n -> from side position
        if (head == null) {
            System.out.println("Lenked List is Empty :");
            return -1;
        } else if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int toFindIndex=size-n;
        Node prev=head;
        for(int i=1; i<toFindIndex; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=prev.next.next;
        size--;
        return val;
    }


    //Check Palindrome LinkedList

    //to find midd
    public Node tofindMidd(Node head){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null) {
            slow=slow.next;   //+1 moves
            fast=fast.next.next;  // +2 moves
        }

        return slow;
    }
    public boolean palindrome(){
        if(head ==null || head.next==null){
            return true;
        }
        //find midd
        Node midd=tofindMidd(head);
        //reverse 2nd half LinkedList
        Node curr=midd;
        Node prev=null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=null;
            prev=curr;
            curr=next;
        }
        Node rightHead=prev;
        Node leftHead=head;

        while (rightHead != null) {
            if(rightHead.data != leftHead.data){
                return false;
            }
            leftHead=leftHead.next;
            rightHead=rightHead.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Reverse ll = new Reverse(); // Use Use scratch linkedList
        // ll.addFirst(5);
        // ll.addFirst(56);
        // ll.addFirst(54);
        // ll.addFirst(39);
        // ll.addLast(89);
        // ll.addFirst(63);
        // ll.addLast(59);
        // ll.addIndex(95, 4);
        // printFuntion();
        // System.out.println("size= " + size);
        // System.out.println(ll.palindrome());
    }

}
