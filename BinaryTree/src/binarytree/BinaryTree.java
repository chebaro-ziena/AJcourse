
package binarytree;

/**
 *
 * @author DELL
 */
public class BinaryTree<Anytype>
{
	private BinaryNode Root;
	
	public BinaryTree()
	{
		Root = null;
	}
	
    public BinaryTree( Anytype rootValue )
    {
        Root = new BinaryNode( rootValue, null, null );
    }
    
	public BinaryTree(BinaryNode theRoot)
	{
		Root = theRoot;
	}

    public BinaryNode getRoot( )
    {
        return Root;
    }
    
    public void makeEmpty( )
    {
        Root = null;
    }

    public boolean isEmpty( )
    {
        return Root == null;
    }

    public void printPreOrder( )
    {
      if( Root != null )
          printPreOrder(Root);   // Method 1
       // Root.printPreOrder( ); // Method 2
    }
   
    // Method 1 - recursive helper
    private void printPreOrder(BinaryNode cn)
    {
       System.out.println(cn.getElement().toString());
       
       if(cn.getLeft() != null)
    	   printPreOrder(cn.getLeft());
       
       if(cn.getRight() != null)
    	   printPreOrder(cn.getRight());
    }

    public void printInOrder( )
    {
        if( Root != null )
        	printInOrder(Root); // Method 1
          	// Root.printInOrder( );  // Method 2
    }
    
    // Method 1 - recursive helper
    private void printInOrder(BinaryNode CR)
    {
    	if (CR.getLeft() != null)
    		printInOrder(CR.getLeft());
    		
    	System.out.println(CR.getElement().toString());
    	
    	if (CR.getRight() != null)
    		printInOrder(CR.getRight());	
    }

    public void printPostOrder( )
    {
      if( Root != null )
          printPostOrder(Root);   // Method 1
       // Root.printPostOrder( ); // Method 2
    }

    // Method 1 - recursive helper
    private void printPostOrder(BinaryNode cn)
    {      
       if(cn.getLeft() != null)
    	   printPreOrder(cn.getLeft());
       
       if(cn.getRight() != null)
    	   printPreOrder(cn.getRight());
       
       System.out.println(cn.getElement().toString());
    }
    
    public void PrintLevelOrder() // Using a Queue
    {    	
    	if (Root == null)
    		System.out.println("Tree is empty");
    	else
    	{
        /*
            LinkedQueue<BinaryNode> q = new LinkedQueue<BinaryNode>();
            q.Enqueue(Root);    
        	
        	BinaryNode n;
    		while (! q.isEmpty())
    		{
    			n = q.getFront();
    			// add its left to the q
    			if (n.getLeft() != null)
    				q.Enqueue(n.getLeft());
    			
    			// add its right to the q
    			if (n.getRight() != null)
    				q.Enqueue(n.getRight());
    			
    			// print the value of the node
    			System.out.println(n.getElement().toString());		
    			
    			// remove the node from the q
    			q.Dequeue();
    		}
        */
    	}
    }
    
    public int Size( )
    {
    	return Size(Root);  // Method 1
        // return Root.Size( );  // Method 2
    }

    // Method 1 - recursive helper
    private int Size( BinaryNode currentRoot )
    {
        if( currentRoot == null )
            return 0;
        else
            return 1 + Size( currentRoot.getLeft() ) + Size( currentRoot.getRight() );
    }
    public int sum(){
    
        if (this.Root==null){
        
            return -1;
        }else{
        return sum(Root);}
    }
    private int sum(BinaryNode root){
    int sum=0;
          sum+ =root.getElement();
       
       if(root.getLeft() != null)
    	   sum(root.getLeft());
       
       if(root.getRight() != null)
    	   sum(root.getRight());
      
    return sum;
    }
        
}
