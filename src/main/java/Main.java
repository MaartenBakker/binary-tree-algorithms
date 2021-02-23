public class Main {

    public static void main(String[] args) {
        TreeNode node_6 = new TreeNode(6, null, null);
        TreeNode node_5 = new TreeNode(5, null, null);
        TreeNode node_4 = new TreeNode(4, null, null);
        TreeNode node_3 = new TreeNode(3, null, node_6);
        TreeNode node_2 = new TreeNode(2, node_4, node_5);
        TreeNode node_1 = new TreeNode(1,  node_2, node_3);

        System.out.println(PreOrderTraversal.preOrderRecursive(node_1));
        System.out.println(PreOrderTraversal.preOrderIterative(node_1));

        System.out.println(InOrderTraversal.inOrderRecursive(node_1));
        System.out.println(InOrderTraversal.inOrderIterative(node_1));

        System.out.println(PostOrderTraversal.postOrderRecursive(node_1));
        System.out.println(PostOrderTraversal.postOrderIterative(node_1));
    }
}
