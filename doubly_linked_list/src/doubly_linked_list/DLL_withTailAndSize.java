package doubly_linked_list;
/**
 *
 * @author DELL
 */
public class DLL_withTailAndSize implements DLLInterface {

    private DLLNode head;
    private DLLNode tail;
    private int size;

    public DLL_withTailAndSize() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public DLL_withTailAndSize(DLLNode head) {
        this.head = this.tail = head;
        this.size = 1;
    }

    public DLL_withTailAndSize(Object headValue) {

        this.head = this.tail = new DLLNode(headValue);
        this.size = 1;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null; 

    }

    public void makeEmpty() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public DLLNode getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public DLLNode getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        } else {
            return this.tail;
        }
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }


    public DLLNode getNode(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (isEmpty()) {
            throw new RuntimeException("Cannot fetch node, list is empty!");
        } else {
            DLLNode currentNode = this.head;
            int i = 0;
            while (currentNode != null) { 
                if (i == index) {
                    return currentNode;
                }
                i++;
                currentNode = currentNode.getNext();
            }
            throw new RuntimeException("Object at given index is not found!");
        }
    }

    @Override
    public Object get(int index) {
        return this.getNode(index).getValue();
    }

    //same implementation as SLL
    @Override
    public int indexOf(Object element) {
        DLLNode currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    @Override
    public void insertAtBack(Object newElement) {
        if (isEmpty()) {
            this.head = this.tail = new DLLNode(newElement);
            
        } else {
            DLLNode nodeToAdd = new DLLNode(newElement, null, this.tail); 
            this.tail.setNext(nodeToAdd); 
            this.tail = nodeToAdd; 
        }
        this.size++;
    }

    
    @Override
    public void insertAtFront(Object newElement) {
        if (isEmpty()) {
            this.head = this.tail = new DLLNode(newElement);
        } else {
            DLLNode nodeToAdd = new DLLNode(newElement, head, null);
            this.head.setPrevious(nodeToAdd); 
            this.head = nodeToAdd; 

        }
        this.size++;
    }

    @Override
    public void removeFromBack() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == null) { 
            makeEmpty();
        } else {
        
            DLLNode nodeBeforeTail = this.tail.getPrevious();
            nodeBeforeTail.setNext(null);
            this.tail = nodeBeforeTail; 
            this.size--;
        }
    }

    
    @Override
    public void removeFromFront() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == null) { //or if this.head equals this.tail
            makeEmpty();
        } else {
            this.head = this.head.getNext(); //new head is now the next of old head
            this.head.setPrevious(null); //new head's previous is now set to null
            this.size--;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            DLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("");
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            DLLNode currentNode = this.getTailNode();
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " <-- ");
                currentNode = currentNode.getPrevious();
            }
            System.out.println("");
        }
    }

    public void removeDuplicates (){
     if (isEmpty()) {
            throw new NullPointerException("DLL is empty. No values to show.");
        } else {
         DLLNode currentnode= new DLLNode(this.head);
         
         
         while(currentnode!= this.tail){
         if(currentnode.getValue().equals(currentnode.getNext().getValue())){
             currentnode.setNext(currentnode.getNext().getNext());}
            
         
     currentnode.getNext();}
    
    }}
 
    public static void main(String[] args) {	  
       
        DLL_withTailAndSize myList = new DLL_withTailAndSize("1");	      
       	        
        myList.insertAtBack("2");
        myList.insertAtBack("2");
        myList.insertAtBack("3");
        myList.insertAtBack("4");
       System.out.println("the DLL  :");
        myList.print();
       
        
        System.out.println("the DLL after deleting doublicates :");
        myList.removeDuplicates();
        myList.print();
                
        }}