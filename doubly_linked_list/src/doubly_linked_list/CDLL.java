
package doubly_linked_list;

/**
 *
 * @author DELL
 */
public class CDLL implements DLLInterface {
    private CDLLNode head;
    private CDLLNode tail;
    private int size;
    
    public CDLL_withTailAndSize() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public CDLL(CDLLNode head, CDLLNode tail) {
        this.head = head;
        this.tail = tail;
        this.size = 2;
    }

    public CDLL(CDLLNode head) {
        this.head = this.tail;
        this.size=1;
         
    }
      @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null; //or this.size == 0;
    }
     public void makeEmpty() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public CDLLNode getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public CDLLNode getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        } else {
            return this.tail;
        }
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    //same as DLL without tail
    public CDLLNode getNode(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (isEmpty()) {
            throw new RuntimeException("Cannot fetch node, list is empty!");
        } else {
            CDLLNode currentNode = this.head;
            int i = 0;
            while (currentNode != null) { //not necessarily to use .equals to compare with null
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
        CDLLNode currentNode = this.head;
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
    public void insert(Object newElement) {
        if (isEmpty()) {
            this.head = this.tail = new CDLLNode(newElement);
            //or this.head.setValue(newElement);
        } else {
            if(size==1) //which means there is two nodes head and tail
            { CDLLNode nodeToAdd = new CDLLNode(newElement);
              nodeToAdd.setPrevios(tail);
              nodeToAdd.setNext(tail);
              head=nodeToAdd;

            }
            if(size==2){
              CDLLNode nodeToAdd = new CDLLNode(newElement);
              nodeToAdd.setPrevios(head);
              nodeToAdd.setNext(tail);
              head.setNext(nodeToAdd);
              head.setPrevios(tail);
              tail.setNext(this.head);
              tail.setPrevios(nodeToAdd);
              
            
            }
            if(size>2)
            { CDLLNode nodeToAdd = new CDLLNode(newElement);
              nodeToAdd.setPrevios(head.getNext());
              nodeToAdd.setNext(tail);
              head.setNext(nodeToAdd.getPtevios());
              head.setPrevios(tail);
              tail.setNext(this.head);
              tail.setPrevios(nodeToAdd);
            
            }    
            // the same for insertAtFront because it is a circle . so i won't do it.
        }
        this.size++;
    }

   
 
    @Override
    public void remove(Object element) {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == tail) { //or if this.head equals this.tail
            makeEmpty();
        } else {
            if(size==3)
            {CDLLNode nodeToremove = new CDLLNode(element);
              nodeToremove.setPrevios(null);
              nodeToremove.setNext(null);
              head.setNext(tail);
              head.setPrevios(tail);
              tail.setNext(this.head);
              tail.setPrevios(head);}
            if(size>3)
            {CDLLNode nodeToremove = new CDLLNode(element);
              nodeToremove.setPrevios(null);
              nodeToremove.setNext(null);
              head.setNext(nodeToremove.getPrevios());
              head.setPrevios(tail);
              tail.setNext(this.head);
              tail.setPrevios(nodeToremove.getPrevios());}
                
//          
            
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

    
    
}
