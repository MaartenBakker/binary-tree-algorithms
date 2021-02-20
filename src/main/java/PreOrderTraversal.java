import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public static List<Integer> PreOrderRecursive(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        if (root == null) {
            return values;
        }

        values.add(root.getVal());
        values.addAll(PreOrderRecursive(root.getLeft()));
        values.addAll(PreOrderRecursive(root.getRight()));

        return values;
    }

    public static List<Integer> PreOrderIterative(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        if (root == null) {
            return values;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(!stack.isEmpty() | current != null) {
            while (current != null) {
                stack.push(current);
                values.add(current.getVal());
                current = current.getLeft();
            }
            current = stack.pop();
            current = current.getRight();
        }
        return values;
    }
}
