/**
 * CS 146 Project 2
 * @author Harkamal Grewal
 * @author Gurpreet Singh
 */

public class BinarySearchTree<T extends Comparable<T>> {

	protected BinaryNode<Integer> root; // the root of the given tree
    
	/**
	 * Constructs an empty BST.
	 */
	public BinarySearchTree() {
		this.root = null;
	}
    
	/**
	 * Inserts the integer in the tree
	 * @param a the value to be stored in the tree
	 */
	public void insert(Integer a) {
		root = insert(a, root); // recursive call the helper method

	}
	
	/**
	 * Recursive helper method to insert a value in the tree
	 * @param x the value to be inserted
	 * @param t the node to insert value in 
	 * @return the node with the inserted value
	 */
	protected BinaryNode<Integer> insert(Integer x, BinaryNode<Integer> t) {
		if (t == null) {
			return new BinaryNode<Integer>(x, null, null);
		}
		int compareResults = x.compareTo((Integer) t.element);
		if (compareResults < 0) {
			t.left = insert(x, t.left);
		} else if (compareResults > 0) {
			t.right = insert(x, t.right);
		}
		return t;

	}
    
	/**
	 * Removes a value from the tree
	 * @param x the value to be removed
	 */
	public void remove(Integer x) {
		root = remove(x, root); // recursive call to the helper method
	}
    
	/**
	 * Recursive helper method to remove a value from the tree
	 * @param x the value to be removed
	 * @param t the node to remove value from
	 * @return the node with removed value
	 */
	 protected BinaryNode<Integer> remove(Integer x, BinaryNode<Integer> t) {
		if (t == null) {
			return t;
		}
		int compareResult = x.compareTo(t.element);
		if (compareResult < 0) {
			t.left = remove(x, t.left);
		} else if (compareResult > 0) {
			t.right = remove(x, t.right);
		} else if (t.left != null && t.right != null) {
			t.element = findMin(t.right).element;
			t.right = remove(t.element, t.right);
		} else {
			t = (t.left != null) ? t.left : t.right;
		}
		return t;

	}

	 /**
	  * Finds the smallest value in the subtree
	  * @param t the node to look for the smallest value 
	  * @return node containing the smallest value
	  */
	public BinaryNode<Integer> findMin(BinaryNode<Integer> t) {
		if (t == null) {
			return null;
		} else if (t.left == null) {
			return t;
		}
		return findMin(t.left);
	}
    
	/**
	 * Finds the biggest value in the subtree
	 * @param a the node to find the value in
	 * @return the node with the biggest item
	 */
	public BinaryNode<Integer> findMax(BinaryNode<Integer> a) {
		if (a == null) {
			return null;
		} else if (a.left == null) {
			return a;
		}
		return findMax(a.left);
	}
    
	/**
	 * Gets the root of the tree
	 * @return the root of the tree
	 */
	public BinaryNode<Integer> getRoot() {
		return root;
	}
   
	/**
	 * Returns the height of the tree
	 * @return the height of the given root.
	 */
	public int height() {
		return height(root);
	}
    
	/**
	 * Recursive method to find the height of the tree
	 * @param a the node to check height for
	 * @return the height of the node
	 */
	protected int height(BinaryNode<Integer> a) {
		if (a == null) {
			return -1;
		} else {
			return 1 + Math.max(height(a.left), height(a.right));
		}
	}
    
	/**
	 * Checks if the tree is empty or not
	 * @return true or false 
	 */
	public boolean isEmpty() {
		return root == null;
	}
    
    /**
     * Checks for a given value in the tree
     * @param x the value to look up for in the tree
     * @return true if the value is in the tree
     */
	public boolean contains(Integer x) {
		return contains(x, root);
	}
    
	/**
	 * Recursive helper method for contains method
	 * @param x the value to find
	 * @param t the node to find the value in
	 * @return true or false
	 */ 
	private boolean contains(Integer x, BinaryNode<Integer> t) {
		if (t == null) {
			return false;
		}
		int compareResult = x.compareTo(t.element);
		if (compareResult < 0) {
			return contains(x, t.left);
		} else if (compareResult > 0) {
			return contains(x, t.right);
		} else {
			return true; // Match
		}
	}
}