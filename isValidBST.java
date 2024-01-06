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
    static Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(root.data>key){
            root.left=insert(root.left,key);
        }
        else{
            root.right=insert(root.right,key);
        }
        return root;
    }
    static boolean ans=true;
    static boolean isBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isBST(root.left,min,root) && isBST(root.right,root,max);

    }
    public static void main(String[] args) {
        Node root=null;
        int arr[]={8,5,3,1,4,6,10,11,14};
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        System.out.println(isBST(root,null,null));
    }
}
