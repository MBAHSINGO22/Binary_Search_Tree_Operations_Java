package PERTEMUAN5;

public class MainTree {
    public static void main(String[] args) {
        Tree theTree = new Tree();

        theTree.add(7);
        theTree.add(5);
        theTree.add(1);
        theTree.add(10);
        theTree.add(3);
        theTree.add(6);


        System.out.println("Preorder:");
        theTree.preorderTraversal();
        System.out.println();

        System.out.println("\nMenghapus 10:");
        theTree.remove(10);
        theTree.preorderTraversal();
        System.out.println();

        System.out.println("\nMenghapus 7:");
        theTree.remove(7);
        theTree.preorderTraversal();
        System.out.println();

    }
}
