import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a single node in a Tree.
 * Each node contains some data and a list of its children.
 * We use a generic type <T> to allow our node to hold any type of data.
 */
public class TreeNode<T> {
    public T data;
    public List<TreeNode<T>> children;

    /**
     * Constructor to create a new TreeNode.
     * @param data The data to be stored in this node.
     */
    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>(); // Initialize the list of children
    }

    /**
     * Adds a child node to this node.
     * @param child The child node to add.
     */
    public void addChild(TreeNode<T> child) {
        this.children.add(child);
    }
}
