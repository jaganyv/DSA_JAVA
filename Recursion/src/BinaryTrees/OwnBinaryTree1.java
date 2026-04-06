package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class OwnBinaryTree1 {
    static void inOrder(TreeNode1 root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    static void preOrder(TreeNode1 root){
        if(root == null){
            return;
        }
        System.out.print((root.val + " "));
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(TreeNode1 root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    static void orderTraversal(TreeNode1 root){
        if(root==null){
            return;
        }
        Queue<TreeNode1> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode1 current = queue.poll();
            System.out.print(current.val + " ");
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode1 node = new TreeNode1(20);
        node.left = new TreeNode1(10);
        node.right = new TreeNode1(5);
        System.out.print("InOrder: ");
        inOrder(node);
        System.out.println();
        System.out.print("PreOrder: ");
        preOrder(node);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(node);
        System.out.println();
        System.out.print("Level Order Traversal: ");
        orderTraversal(node);
    }
}