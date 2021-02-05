
package binarytree;

import static binarytree.BST.PrintSortedUsingBST;
import java.util.ArrayList;


public class finalExam {
    public int countTwoChildNodes( ){
        
            return  countTwoChildNodes(this.root);
        }	
        
    private int countTwoChildNodes(BSTNode root) {
			if(root== null) {
				return 0;
			} else if((root.getLeft()!= null) && (root.getRight()!= null)) {
				return 1;
			} else {
				return countTwoChildNodes(root.getLeft()) + countTwoChildNodes(root.getRight());
			}
		}
    
    public void mirror( ){
      
        if( root != null )
          mirror(root); 
    }
     private void mirror(BinaryNode root ){
         
         System.out.println(root.getValue().toString());
          BinaryNode right= root.getRight();
         BinaryNode left = root.getLeft();
         root.setLeft(right);
         root.setRight(left);
         if(root.getLeft() != null)
         
             mirror(root.getLeft());
       
         if(root.getRight() != null){
    	 
             mirror(root.getRight());}
        
    
    } 
     public static void PrintSortedUsingBST(ArrayList list)
    {   
        BSTNode root= (BSTNode) list.get(0);
        if(list.get(2)>list.get(1))
        root.setLeft(list.get(1));
        root.setRight(list.get(2));
         
    
    	if (root.getLeft() != null)
    		PrintSortedUsingBST(root.getLeft());
    		
    	System.out.println(root.getValue().toString());
    	
    	if (root.getRight() != null)
    		PrintSortedUsingBST(root.getRight());	
    }
       public static void main(String[] args) {
          ArrayList mylist = new ArrayList(); 
          
          mylist.add(5);
          mylist.add(7);
          mylist.add(3);
          mylist.add(4);
          mylist.add(1);
          mylist.add(9);
          mylist.add(6);
          mylist.add(2);
          PrintSortedUsingBST(mylist);
         }}
}
