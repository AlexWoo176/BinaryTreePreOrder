package codegym;

import java.util.Stack;

public class BinaryTreePreOrder {
    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.printf("%d ", root.value);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void preorderIter(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            System.out.printf("%d ", temp.value);

            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
}
