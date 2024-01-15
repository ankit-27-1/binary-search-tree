import java.lang.reflect.Array;
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
    static Node addInStack(Node root,Stack<Integer> s1){
        if(root==null){
            return null;
        }
        addInStack(root.left,s1);
        s1.push(root.data);
        addInStack(root.right,s1);
        return root;
    }
    static Node addInList(Node root,ArrayList<Integer> list){
        if(root==null){
            return null;
        }
        addInList(root.left,list);
        list.add(root.data);
        addInList(root.right,list);
        return root;
    }
    public static void main(String[] args) {
        Node root1=new Node(5);
        root1.left=new Node(3);
        root1.left.left=new Node(2);
        root1.left.right=new Node(4);
        root1.right=new Node(7);
        root1.right.left=new Node(6);
        root1.right.right=new Node(8);
        Node root2=new Node(10);
        root2.left=new Node(6);
        root2.left.left=new Node(3);
        root2.left.right=new Node(8);
        root2.right=new Node(15);
        root2.right.left=new Node(11);
        root2.right.right=new Node(18);
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> s1=new Stack<>();
        int k=16;
        addInList(root1,list);
        for(int i=0;i<list.size();i++){
            addInStack(root2,s1);
            while(!s1.isEmpty() && (s1.peek()+list.get(i)!=k)){
                s1.pop();
            }
            if(!s1.isEmpty()){
                System.out.println(list.get(i)+ " " + s1.peek());
            }
        }
    }
}
