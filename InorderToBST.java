class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class InorderToBST {
    
    // Build BST from inorder array (sorted)
    public static TreeNode buildBST(int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        
        // Pick middle element as root for balanced BST
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(inorder[mid]);

        root.left = buildBST(inorder, start, mid - 1);
        root.right = buildBST(inorder, mid + 1, end);

        return root;
    }

    // Print inorder traversal of the tree
    public static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        int[] inorder = {1, 2, 3, 4, 5, 6, 7}; // example inorder
        TreeNode root = buildBST(inorder, 0, inorder.length - 1);

        System.out.println("Inorder traversal of constructed tree:");
        printInorder(root);
    }
}
