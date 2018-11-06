package BinaryTrees;

import java.util.LinkedList;

public class FindBelowLeftValue {

    public int findBottomLeftValue(TreeNode root) {

        if(root==null){
            return 0;
        }
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(queue.size()>0){
            root=queue.remove();

            if(root.right!=null){
                queue.add(root.right);
            }

            if(root.left!=null){
                queue.add(root.left);
            }
        }
        return root.val;
    }
}
