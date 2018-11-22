package ThanksgivingThanks.Trees;

import BinaryTrees.TreeNode;

import java.util.*;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        if(root==null){
            return result;
        }

        queue.offer(root);

        while(queue.size()>0){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode p=queue.poll();
                list.add(p.val);

                if(p.left!=null){
                    queue.offer(p.left);
                }

                if(p.right!=null){
                    queue.offer(p.right);
                }
            }
            result.add(list);
        }

        Collections.reverse(result);

        return result;
    }
}
