import java.util.ArrayList;
import java.util.Arrays;
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
    static Node createBST(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,start,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    static Node inOrder2(Node root){
        if(root==null){
            return null;
        }
        inOrder2(root.left);
        System.out.print(root.data+" ");
        inOrder2(root.right);
        return root;
    }
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root1,list);
        inOrder(root2,list);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        Arrays.sort(arr);
        Node root3=createBST(arr,0,arr.length-1);
        inOrder2(root3);
    }
}
