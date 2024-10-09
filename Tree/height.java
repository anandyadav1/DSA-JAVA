
public class height {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    //Height calculate
    public static int heightCalculate(Node root){
        if(root == null){
            return 0;
        }

        int lh=heightCalculate(root.left); //lh->left height
        int rh=heightCalculate(root.right); //rh->right height

        return Math.max(lh,rh)+1;

    }


    //Count of Node
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount =count(root.left);
        int rightCount= count(root.right);


        return leftCount+rightCount +1;
    }


    //Sum of all Node
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftSum=sum(root.left);
        int rightSum=sum(root.right);

        return leftSum+rightSum +root.data;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Height of tree =  "+heightCalculate(root));
        System.out.println("Total Node =  "+count(root));
        System.out.println("Total Node of Sum =  "+sum(root));

    }
}
