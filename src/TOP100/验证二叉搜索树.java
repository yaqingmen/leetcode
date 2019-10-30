package TOP100;

public class 验证二叉搜索树 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {
        验证二叉搜索树 t = new 验证二叉搜索树();
        TreeNode root = new TreeNode(5);
        root.left =  new TreeNode(1);
        root.right =  new TreeNode(4);
        root.right.left =  new TreeNode(3);
        root.right.right =  new TreeNode(6);
        System.out.println(t.isValidBST(root));
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }
    private boolean dfs(TreeNode root) {
        if(root == null) {
            return false;
        }
        if(root.left.val >= root.val || root.right.val <= root.val) {
            return false;
        }
        return dfs(root.left) && dfs(root.right);
    }
}
