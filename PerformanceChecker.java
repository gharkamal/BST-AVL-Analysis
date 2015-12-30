import java.util.Random;


/**
 * CS 146 Project 2
 * @author Harkamal Grewal
 * @author Gurpreet Singh
 */
 

/**
 * To Analyze the performances of the BST and AVL tree
 */
public class PerformanceChecker {
 
 
   public static void main(String[] args)
   {
    
    AVLTree2<Integer> a = new AVLTree2<Integer>(); // Constructs an AVL Tree
    
    BinarySearchTree<Integer> b = new BinarySearchTree<Integer>(); // Constructs a BST tree

      Random one = new Random();
      
      System.out.println("AVL TREE Insert");
      System.out.println("Number of inputs (n):   Time taken (mS):");
     
      long startTime = System.currentTimeMillis();
      
      for(int i = 1; i <= 1000; i++)
      {
      a.insert(one.nextInt(100)); 
      }
      
      long endTime = System.currentTimeMillis();
      System.out.println("1000                                " + (endTime - startTime));
      
      long s1 = System.currentTimeMillis();
      
      for(int i = 1; i <= 10000; i++)
      {
      a.insert(one.nextInt(100)); 
      }
      
      long e1 = System.currentTimeMillis();
      System.out.println("10,000                              " + (e1 - s1));
      
      long s2 = System.currentTimeMillis();
      
      for(int i = 1; i <= 100000; i++)
      {
      a.insert(one.nextInt(100)); 
      }
      
      long e2 = System.currentTimeMillis();
      System.out.println("100,000                             " + (e2 - s2));
      long s3 = System.currentTimeMillis();
      
      for(int i = 1; i <= 1000000; i++)
      {
      a.insert(one.nextInt(100)); 
      }
      
      long e3 = System.currentTimeMillis();
      System.out.println("1,000,000                           " + (e3 - s3));
      
      System.out.println();
      System.out.println("BST TREE Insert");
      System.out.println("Number of inputs (n):   Time taken (mS):");
     
      long s4 = System.currentTimeMillis();
      
      for(int i = 1; i <= 1000; i++)
      {
      b.insert(one.nextInt(100)); 
      }
      
      long e4 = System.currentTimeMillis();
      System.out.println("1000                                " + (e4 - s4));
      
      long s5 = System.currentTimeMillis();
      
      for(int i = 1; i <= 10000; i++)
      {
      b.insert(one.nextInt(100)); 
      }
      
      long e5 = System.currentTimeMillis();
      System.out.println("10,000                              " + (e5 - s5));
      
      long s6 = System.currentTimeMillis();
      
      for(int i = 1; i <= 100000; i++)
      {
      b.insert(one.nextInt(100)); 
      }
      
      long e6 = System.currentTimeMillis();
      System.out.println("100,000                             " + (e6 - s6));
      long s7 = System.currentTimeMillis();
      
      for(int i = 1; i <= 1000000; i++)
      {
      b.insert(one.nextInt(100)); 
      }
      
      long e7 = System.currentTimeMillis();
      System.out.println("1,000,000                           " + (e7 - s7));
      
      
      // Search efficiency for BST
      
      long s8 = System.currentTimeMillis();
      int check = 0;
      for(int i = 0; i < 1000000; i++) // we tested the loop for n = 1000, 10000, 100000, 1000000
      {
    	  if(b.contains(one.nextInt(Integer.MAX_VALUE)) == true)
    	  {
    		  check += 1;
    	  }
      }
      long e8 = System.currentTimeMillis();
      
      System.out.println("BST Search Efficiency");
      System.out.println("BST took " + (e8-s8) + "mS " + "to find " + check + " values.");
      
      
// Search efficiency for AVL
      
      long s9 = System.currentTimeMillis();
      int check2 = 0;
      for(int i = 0; i < 1000000; i++) // we tested the loop for n = 1000, 10000, 100000, 1000000.
      {
    	  if(a.contains(one.nextInt(Integer.MAX_VALUE)) == true)
    	  {
    		  check2 += 1;
    	  }
      }
      long e9 = System.currentTimeMillis();
      
      System.out.println("AVL Search Efficiency");
      System.out.println("AVL took " + (e9-s9) + "mS " + "to find " + check2 + " values.");
      
      
      
    
      
    

}
}