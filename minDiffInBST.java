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
    public TreeNode treeToList(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return null;
        }
        treeToList(root.left,list);
        list.add(root.val);
        treeToList(root.right,list);
        return root;
    }
    public void listToArr(ArrayList<Integer> list,int[] arr){
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        treeToList(root,list);
        int[] arr=new int[list.size()];
        listToArr(list,arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        return min;
    }
}
