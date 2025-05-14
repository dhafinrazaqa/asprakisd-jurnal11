import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {
    private Node<E> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(E data) {
        Node<E> newNode = new Node<>(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<E> current = queue.poll();
            if (current.getLeft() == null) {
                current.setLeft(newNode);
                break;
            } else {
                queue.add(current.getLeft());
            }
            if (current.getRight() == null) {
                current.setRight(newNode);
                break;
            } else {
                queue.add(current.getRight());
            }
        }
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node<E> node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getData() + " ");
            inorder(node.getRight());
        }
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node<E> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node<E> node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<E> current = queue.poll();
            System.out.print(current.getData() + " ");
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
        System.out.println();
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node<E> node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }

    public boolean search(E data) {
        return search(root, data);
    }

    private boolean search(Node<E> node, E data) {
        if (node == null) {
            return false;
        }
        if (node.getData().equals(data)) {
            return true;
        }
        return search(node.getLeft(), data) || search(node.getRight(), data);
    }
}
