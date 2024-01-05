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
        if(root.data<val){
            root.right=insert(root.right,val);
        }
        else{
            root.left=insert(root.left,val);
        }
        return root;
    }
    static boolean ans=false;
    static Node search(Node root,int key) {
        if(root==null) {
            return null;
        }
        if(root.data==key){
            ans=true;
        }
        if(root.data>key){
            search(root.left,key);
        }
        else{
            search(root.right,key);
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        search(root,14);
        System.out.println(ans);
    }
}
