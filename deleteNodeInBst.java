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
    static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    static Node delete(Node root,int key){
        if(root==null){
            return null;
        }
        if(root.data==key){
            return null;
        }
        if(root.data>key){
            root.left=delete(root.left,key);
        }
        else{
            root.right=delete(root.right,key);
        }
        return root;
    }
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=null;
        int arr[]={8,5,3,1,4,6,10,11,14};
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        delete(root,10);
        inOrder(root);
    }
}
