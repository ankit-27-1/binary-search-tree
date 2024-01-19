/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode inOrderToList(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return null;
        }
        inOrderToList(root.left,list);
        list.add(root.val);
        inOrderToList(root.right,list);
        return root;
    }
    public int[] listToArray(ArrayList<Integer> list,int[] arr){
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public TreeNode arrToBST(TreeNode root,int key){
        if(root==null){
            root=new TreeNode(key);
            return root;
        }
        if(key<root.val){
            root.left=arrToBST(root.left,key);
        }
        else{
            root.right=arrToBST(root.right,key);
        }
        return root;
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inOrderToList(root,list);
        int[] arr=new int[list.size()];
        listToArray(list,arr);
        TreeNode ans=null;
        for(int i=0;i<arr.length;i++){
            ans=arrToBST(ans,arr[i]);
        }
        return ans;
    }
}
