public class Main {
    public static void main(String[] args) {
        BinaryTree<Character> tree = new BinaryTree<>();

        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        tree.insert('F');
        tree.insert('G');
        tree.insert('H');
        tree.insert('I');
        tree.insert('J');
        tree.insert('K');
        tree.insert('L');

        System.out.println("Inorder traversal:");
        tree.inorder(); // Output: D B E A C

        System.out.println("Preorder traversal:");
        tree.preorder(); // Output: A B D E C

        System.out.println("Postorder traversal:");
        tree.postorder(); // Output: D E B C A

        System.out.println("Level order traversal:");
        tree.levelOrder(); // Output: A B C D E

        System.out.println("Total number of nodes: " + tree.countNodes()); // Output: 5

        System.out.println("Apakah huruf 'A' ada di dalam tree? " + tree.search('A')); // Output: true

        System.out.println("Kedalaman tree: " + tree.depth()); // Output: 3
    }
}
