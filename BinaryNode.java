
	
 /**
 * CS 146 Project 2
 * @author Harkamal Grewal
 * @author Gurpreet Singh
 */
	public class BinaryNode<T>
	{
	Integer element; // the element to be added or removed
	int height; // height of the tree
	BinaryNode<Integer> left; // left node
	BinaryNode<Integer> right; //right node
	
	/**
	 * Constructs a Binary node with the given parameters
	 * @param theElement the element to be stored 
	 * @param l the left node of the tree
	 * @param r the right node of the tree
	 */
	public BinaryNode(Integer theElement, BinaryNode<Integer> l, BinaryNode<Integer> r) 
	{
		element = theElement;
		left = l;
		right = r;
	}
	
	/**
	 * Calls the constructor with the given parameters
	 * @param theElement the element to be stored 
	 */
	BinaryNode(Integer theElement)
	{
		this(theElement, null, null);
	}
	
	/**
	 * Returns the element
	 * @return data stored
	 */
	public Integer getData()
	{	
		return element;
	}
	
	/**
	 * Gets the left node of the tree
	 * @return the left node of the tree
	 */
	public BinaryNode<Integer> getLeft() 
	{
		return left;
	}
	
	/**
	 * Gets the right node of the tree
	 * @return the right node of the tree
	 */
	public BinaryNode<Integer> getRight() 
	{
		return right;
	}
	
	/**
	 * Sets the height of the tree
	 * @param height the new height to be set
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	/**
	 * Gets the height of the tree
	 * @return the current height of the tree
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Sets the left node to the new node
	 * @param left the new node to be set as leftt node
	 */
	public void setLeft(BinaryNode<Integer> left)
	{
		this.left = left;
	}
	
	/**
	 * Sets the right node to a new node
	 * @param right the new node to be set as right node
	 */
	public void setRight(BinaryNode<Integer> right)
	{
		this.right = right;
	}

	
}