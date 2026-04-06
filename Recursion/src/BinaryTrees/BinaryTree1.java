package BinaryTrees;
import java.util.*;
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
public class BinaryTree1 {

    static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + "");
        inOrder(root.right);
    }
    static void preorder(TreeNode root){

        if(root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }
    static void postorder(TreeNode root){

        if(root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");

    }
    static void levelOrder(TreeNode root){

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            TreeNode node = q.poll();

            System.out.print(node.val + " ");

            if(node.left != null)
                q.add(node.left);

            if(node.right != null)
                q.add(node.right);
        }
    }
    public static void main(String[] args) {
        // Creating the tree manually

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(20);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(30);
        root.right.left = new TreeNode(40);

        System.out.print("Inorder: ");
        inOrder(root);

        System.out.print("\nPreorder: ");
        preorder(root);

        System.out.print("\nPostorder: ");
        postorder(root);

        System.out.print("\nLevel Order: ");
        levelOrder(root);
    }
}
