package Own_Stuffs;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTreeTraversal {

    static void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    static void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(TreeNode root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(200);
        node.left = new TreeNode(150);
        node.right = new TreeNode(100);
        node.left.left = new TreeNode(75);
        node.right.right = new TreeNode(50);

        System.out.println("InOrder: ");
        inOrder(node);

        System.out.println("PreOrder: ");
        preOrder(node);

        System.out.println("PostOrder: ");
        postOrder(node);

    }
}
