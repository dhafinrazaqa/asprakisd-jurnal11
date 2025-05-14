public class Node<E> {
    private Node<E> left, right;
    private E data;

    public Node() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public Node(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}