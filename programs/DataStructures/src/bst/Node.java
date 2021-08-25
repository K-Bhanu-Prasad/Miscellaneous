package bst;

/**
 * @author bkuraman
 *
 */

public class Node {

  private int data;

  private Node left;

  private Node right;

  /**
   * @return data
   */
  public int getData() {

    return this.data;
  }

  /**
   * @param data new value of {@link #getdata}.
   */
  public void setData(int data) {

    this.data = data;
  }

  /**
   * @return left
   */
  public Node getLeft() {

    return this.left;
  }

  /**
   * @param left new value of {@link #getleft}.
   */
  public void setLeft(Node left) {

    this.left = left;
  }

  /**
   * @return right
   */
  public Node getRight() {

    return this.right;
  }

  /**
   * @param right new value of {@link #getright}.
   */
  public void setRight(Node right) {

    this.right = right;
  }

}
