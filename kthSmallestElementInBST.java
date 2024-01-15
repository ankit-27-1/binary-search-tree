import java.util.*;
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
    static Node inOrder(Node root, ArrayList<Integer> list){
        if(root==null){
            return null;
        }
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
        root.right.right=new Node(20);
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root,list);
        int k=3;
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        System.out.println(arr[k]);
    }
}
