package ThanksgivingThanks.Trees;

import BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        if(root==null){
            return result;
        }

        stack.push(root);

        while(!stack.empty()){
            TreeNode p=stack.pop();
            result.add(p.val);

            if(p.right!=null){
                stack.push(p.right);
            }

            if(p.left!=null){
                stack.push(p.left);
            }
        }

        return result;
    }
}
