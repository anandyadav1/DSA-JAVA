
public class traversal {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public Node buildTrees(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTrees(nodes);
            newNode.right=buildTrees(nodes);

            return newNode;

        }


        //PreeOrder
        public void preeOrders(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+"  ");
            preeOrders(root.left);
            preeOrders(root.right);
        }

        //PostOrder
        public void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            System.out.print(root.data+"  ");
            postOrder(root.right);
        }


        //InOrder
        public void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data+"  ");
        }


    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTrees(nodes);
        tree.preeOrders(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.inOrder(root);
    }
}
