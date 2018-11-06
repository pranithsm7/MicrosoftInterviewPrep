package BinaryTrees;

import java.util.LinkedList;
import java.util.List;

public class PrintLargestInEachRow {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> result=new LinkedList<>();
        LinkedList<TreeNode> queue=new LinkedList<>();

        if(root==null){
            return result;
        }
        queue.add(root);

        while(queue.size()>0){

            int maxValue=Integer.MIN_VALUE;
            int size=queue.size();

            for(int i=0;i<size;i++){

                TreeNode value=queue.remove();
                maxValue=Math.max(value.val,maxValue);

                if(value.left!=null) queue.add(value.left);
                if(value.right!=null) queue.add(value.right);
            }
            result.add(maxValue);

        }
        return result;
    }
}
