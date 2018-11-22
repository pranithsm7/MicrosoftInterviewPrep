package ThanksgivingThanks.Trees;

import BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack=new Stack<>();
        List<Integer> result=new ArrayList<>();

        TreeNode p=root;
        while(p!=null || !stack.empty()){

            while(p!=null){
                stack.push(p);
                p=p.left;
            }

            p=stack.pop();
            result.add(p.val);
            p=p.right;
        }

        return result;
    }
}
