package niuke;


import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     *
     * 求二叉树的最大深度：两种方式递归+bfs
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        //递归
        //if(root == null) return 0;
        //return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
        //bfs
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int qsize = queue.size();
            for(int i = 0; i < qsize; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            res++;
        }
        return res;
    }
}
