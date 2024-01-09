public class file7 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Node mirrorBST(Node root) {
        if(root==null){
            return null;
        }
        Node lefts=mirrorBST(root.left);
        Node rights=mirrorBST(root.right);
        root.left=rights;
        root.right=lefts;
        return root;
    }
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        mirrorBST(root);
        inOrder(root);
    }
}
