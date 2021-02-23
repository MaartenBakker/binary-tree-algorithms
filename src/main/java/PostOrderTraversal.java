import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    public static List<Integer> postOrderRecursive(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        if (root == null) {
            return values;
        }

        values.addAll(postOrderRecursive(root.getLeft()));
        values.addAll(postOrderRecursive(root.getRight()));
        values.add(root.getVal());

        return values;
    }

    public static List<Integer> postOrderIterative(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        if (root == null) {
            return values;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()) {
            TreeNode top = stack.pop();
            values.add(0, top.getVal());
            if (top.getLeft() != null) {
                stack.push(top.getLeft());
            }
            if (top.getRight() != null) {
                stack.push(top.getRight());
            }
        }
        return values;
    }
}
