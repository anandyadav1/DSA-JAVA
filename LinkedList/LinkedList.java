public class LinkedList {
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

    //add any given position
    public void addIndex(int data, int idx){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i=0;
        while (i < idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }



    //Remove from first
    public int removeFirst(){
        if(head == null){
            System.out.println("Linkedlist is empty :");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }


    //Remove last Element
    public int removeLast(){
        if(head==null){
            return -1;
        }else if(size ==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val =tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    // printFunction method
    public static void printFuntion() {
        if (head == null) {
            System.out.println("LinkedList is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data  + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Use HelloWorld class for custom linked list
        ll.addFirst(56);
        ll.addFirst(31);
        ll.addFirst(39);
        ll.addLast(89);
        ll.addFirst(63);
        ll.addLast(59);
        ll.addIndex(95, 1);
        System.out.println("size= "+size);
        System.out.println("Remove from first element ="+ll.removeFirst());
        System.out.println("Remove from first element ="+ll.removeFirst());
        printFuntion();
        System.out.println("size= "+size);
        printFuntion();
        System.out.println("Remove from last element ="+ll.removeLast());
        printFuntion();
        System.out.println("size= "+size);
    }
}
