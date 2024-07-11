public class Main {
    public static void main(String[] args) {
        BinaryTreeDepth solution = new BinaryTreeDepth();

        // Example usage:
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Maximum depth of the binary tree: " + solution.maxDepth(root));

    }
}
      System.out.println("Thread is a proccess in the background of a program that allowes the program to do mutiple things at the same time.");