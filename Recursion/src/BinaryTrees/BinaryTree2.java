package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode2{
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree2 {

    static void levelOrderByLevel(TreeNode2 root){

        if(root == null) return;

        Queue<TreeNode2> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++){

                TreeNode2 node = queue.poll();

                System.out.print(node.val + " ");   // print node

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }

            System.out.println(); // new line after each level
        }
    }

    public static void main(String[] args) {

        TreeNode2 tn2 = new TreeNode2(20);
        tn2.left = new TreeNode2(10);
        tn2.right = new TreeNode2(30);
        tn2.left.left = new TreeNode2(50);
        tn2.right.right = new TreeNode2(100);
        tn2.left.left.left = new TreeNode2(1000);

        levelOrderByLevel(tn2);
    }
}