import lombok.Getter;

@Getter
public class TreeNode {
    private final int val;
    private final TreeNode left;
    private final TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}