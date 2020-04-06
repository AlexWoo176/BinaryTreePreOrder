package codegym;
public class MainTest {
    public static void main(String[] args) {
        BinaryTreePreOrder bin = new BinaryTreePreOrder();
        TreeNode rootNode = new TreeNode(60);
        rootNode.left = new TreeNode(55);
        rootNode.left.left = new TreeNode(45);
        rootNode.left.right = new TreeNode(57);
        rootNode.left.right.left = new TreeNode(59);
        rootNode.right = new TreeNode(100);
        rootNode.right.left = new TreeNode(67);
        rootNode.right.right = new TreeNode(107);
        rootNode.right.right.left = new TreeNode(101);

        System.out.println("Sử dụng phương pháp Đệ Quy: ");
        bin.preorder(rootNode);

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Sử dụng phương pháp Vòng Lặp: ");
        bin.preorderIter(rootNode);

    }
}
