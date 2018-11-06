package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> result=new ArrayList<>();
            LinkedList<TreeNode> queue=new LinkedList<>();

            if(root==null){
                return result;
            }
            queue.add(root);

            while(queue.size()>0){
                List<Integer> list=new ArrayList<>();
                int size=queue.size();

                for(int i=0;i<size;i++){
                    TreeNode temp=queue.poll();
                    list.add(temp.val);
                    if(temp.left!=null){queue.add(temp.left);}
                    if(temp.right!=null){queue.add(temp.right);}
                }

                result.add(list);

            }
            return result;
        }
    }
}
