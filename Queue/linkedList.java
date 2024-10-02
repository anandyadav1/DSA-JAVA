
public class linkedList {
    static class Node {
        int data;
        Node next;
         Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class  Queue {
        static Node head=null;
        static Node tail=null;

        //add by tail
        public void add(int data){
            Node newNode= new Node(data);
        if(head ==null && tail ==null){
            head=tail =newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //remove Node
    public int remove(){
        if(head==null && tail == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        if(head==tail){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val = head.data;
        head=head.next;
        return val;
    }

    //peek Node
    public int peek(){
        if (head==null && tail==null) {
            System.out.println("Queue is the Empty ");
            return -1;
        }
        return head.data;
    }
    }

    public static void main(String[] args) {
        Queue q  = new Queue();
        q.add(34);
        q.add(56);
        System.out.println("This is the peek element in queue =  "+q.peek());
        System.out.println("This is the remove element in queue =  "+q.remove());
        System.out.println("This is the peek element in queue =  "+q.peek());
    }
}
