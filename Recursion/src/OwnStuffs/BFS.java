package OwnStuffs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class BFS {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){

                TreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }

            result.add(level);
        }

        return result;
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1000);
        node.left = new TreeNode(500);
        node.right = new TreeNode(750);
        node.left.left = new TreeNode(400);
        node.left.right = new TreeNode(300);
        node.right.left = new TreeNode(200);
        node.right.right = new TreeNode(100);

        System.out.println(levelOrder(node));

    }
}
