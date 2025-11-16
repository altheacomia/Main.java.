/**
 * This class represents the entire Tree structure.
 * It primarily holds a reference to the root node of the tree.
 */
public class Tree<T> {
    public TreeNode<T> root;

    /**
     * Constructor for the Tree.
     * @param root The root node of the tree.
     */
    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    /**
     * Prints all nodes in the tree in a hierarchical way.
     */
    public void printTree() {
        printTreeRecursive(root, 0);
    }

    /**
     * A private helper method that recursively prints a node and its children.
     */
    private void printTreeRecursive(TreeNode<T> node, int level) {
        if (node == null) {
            return;
        }

        // Indentation based on depth level
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        System.out.println("- " + node.data);

        // Recursively print each child
        for (TreeNode<T> child : node.children) {
            printTreeRecursive(child, level + 1);
        }
    }
}
