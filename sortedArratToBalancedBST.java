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
    static Node balancedBST(int[] arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(mid);
        root.left=balancedBST(arr,start,mid-1);
        root.right=balancedBST(arr,mid+1,end);
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
        int arr[]={3,6,5,8,10,11,12};
        root=balancedBST(arr,0,arr.length-1);
        inOrder(root);
    }
