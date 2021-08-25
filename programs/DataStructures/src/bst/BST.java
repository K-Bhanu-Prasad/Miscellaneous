package bst;

/**
 * @author bkuraman
 *
 */
public class BST {

  // Create new Node
  public Node createNewNode(int data) {

    Node node = new Node();
    node.setData(data);
    node.setLeft(null);
    node.setRight(null);
    return node;
  }

  // Insert new Node
  public Node insertNode(Node node, int data) {

    if (node == null) {
      return createNewNode(data);
    }
    if (data < node.getData()) {
      node.setLeft(insertNode(node.getLeft(), data));
    } else if (data > node.getData()) {
      node.setRight(insertNode(node.getRight(), data));
    }

    return node;
  }

  // Traverse
  // 1. PreOrderTraverse ( Root->Left->right )
  public void preOrderTraverse(Node root) {

    if (root == null)
      return;

    System.out.print(root.getData() + " ");
    preOrderTraverse(root.getLeft());
    preOrderTraverse(root.getRight());
  }

  // 2. InOrderTraverse ( Left->Root->right )
  public void inOrderTraverse(Node root) {

    if (root == null)
      return;

    inOrderTraverse(root.getLeft());
    System.out.print(root.getData() + " ");
    inOrderTraverse(root.getRight());

  }

  // 3. InOrderTraverse ( Left->right->Root )
  public void postOrderTraverse(Node root) {

    if (root == null)
      return;

    postOrderTraverse(root.getLeft());
    postOrderTraverse(root.getRight());
    System.out.print(root.getData() + " ");

  }

  // Search
  public boolean search(Node node, int data) {

    boolean found = false;
    while (node != null && !found) {
      if (node.getData() > data) {
        node = node.getLeft();
      } else if (node.getData() < data) {
        node = node.getRight();
      } else {
        found = true;
        break;
      }

      found = search(node, data);
    }
    return found;
  }

  void someMtd() {

    int[] arr = { 1, 2, 3 };

  }

}
