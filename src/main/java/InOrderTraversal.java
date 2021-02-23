import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public static List<Integer> inOrderRecursive(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        if (root == null) {
            return values;
        }

        values.addAll(inOrderRecursive(root.getLeft()));
        values.add(root.getVal());
        values.addAll(inOrderRecursive(root.getRight()));

        return values;
    }

    public static List<Integer> inOrderIterative(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        if (root == null) {
            return values;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(!stack.isEmpty() | current != null) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            values.add(current.getVal());
            current = current.getRight();
        }
        return values;
    }
}
