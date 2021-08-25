package bst;

/**
 * @author bkuraman
 *
 */

public class BstApp {

  public static void main(String[] args) {

    BST bst = new BST();
    Node root = null;
    root = bst.insertNode(root, 8);
    root = bst.insertNode(root, 3);
    root = bst.insertNode(root, 10);
    root = bst.insertNode(root, 9);
    root = bst.insertNode(root, 14);
    root = bst.insertNode(root, 1);
    root = bst.insertNode(root, 5);
    root = bst.insertNode(root, 24);

    System.out.println("PreOrder Traverse");
    bst.preOrderTraverse(root);

    System.out.println("\n");
    System.out.println("InOrder Traverse");
    bst.inOrderTraverse(root);

    System.out.println("\n");
    System.out.println("postOrder Traverse");
    bst.postOrderTraverse(root);

    System.out.println("\n");
    System.out.println(bst.search(root, 3));
    System.out.println(bst.search(root, 100));
  }

}
