
package siglelinkedlist;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
 public class SigleLinkedList {
       Node head;
    public SigleLinkedList(Node head) {
        this.head = head;
    }
    public SigleLinkedList(Object nodeValue) {
        this.head = new Node(nodeValue);
    }
    
    
    public void add(Object newElement){
    
        if(head== null)
        { head= new Node(newElement);}
        else
        {
        
        Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(newElement));
        
    }
    }
    
    public int size() {
        if (isEmpty()) {
            return 0;
     
        } else {
            Node currentNode = this.head;
            int count = 0;
            while (currentNode != null) {
                currentNode = currentNode.getNext();
                count++;
            }
            return count;
        }
    }
    
     public boolean isEmpty() {
        return this.head == null;
    }
     public void makeEmpty() {
        this.head = null;
    }
     public Node getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public Node getTailNode() {
        return this.getNode(size()-1);
//        if (isEmpty()) {
//            throw new RuntimeException("List is empty! Can't fetch tail.");
//        }
//        //initialize
//        Node currentNode = head;
//        while (currentNode.getNext() != null) {
//            currentNode = currentNode.getNext();
//        }
//        return currentNode;
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    public Node getNode(int index) {
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (isEmpty()) {
            throw new RuntimeException("Cannot fetch node, list is empty!");
        } else {
            Node currentNode = this.head;
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
     public Object get(int index) {
        return this.getNode(index).getValue();
    }
     
     
    
    public int indexOf(Object element) {
        Node currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if(getNode(index).getValue() == element)
                return index;
            else 
            { currentNode=currentNode.getNext();
                index++;}
        }
        throw new RuntimeException("Index of given object is not found!");

    }

    public boolean sure(int i){
            if(i==1)
            return true;
            else
            return false;
    }

    public boolean remove(int index) {
        if(isEmpty())
        {
        throw new RuntimeException("Cannot fetch node, list is empty!");
        }
        else {
        System.out.println("are you sure you want to remove "+ getNode(index)+"?,if yes press 1,other that 0");
                  Scanner s=new Scanner(System.in) ;

        int i= s.nextInt();
         if(sure(i)){
        
                if (index == 0) {
            // removing the head 
            head= head.getNext();
        }
                else{
            Node currentNode = this.head;
            
            for (int y = 0; y < index - 1; y++) {
                currentNode = currentNode.getNext();
            }
            //to skip index element
             currentNode.setNext(currentNode.getNext().getNext());
             
      
        return true;
        }}
         
   }
                return false;
    }
   

    
    public boolean remove(Object element) {
        int i=indexOf(element);
        if(this.remove(i))
           return true;
        else
            return false;
    }
    public boolean replace(Object oldElement, Object newElement){
     Node currentNode = head;
            if (currentNode.getNext() != oldElement) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(newElement));
            return true;
            
    }
   
    
         public static void main(String[] args) {
          
           SigleLinkedList myFamily = new SigleLinkedList(null);
        myFamily.add("mohammad");
        myFamily.add("zeina");
        myFamily.add("MotherInLaw");
        System.out.println(myFamily.size());

      1  myFamily.remove("MotherInLaw"); 
        System.out.println(myFamily.size());
        myFamily.add("BabyElias");
        System.out.println(myFamily.indexOf("BabyElias"));
              System.out.println(myFamily.size());

        //lab assignment 2

        SigleLinkedList mySecondFamily = new SigleLinkedList(null);
        mySecondFamily.add("khaled");
        mySecondFamily.add("faten");
        mySecondFamily.add("mahmoud");
        
        myFamily.merge(mySecondFamily);
      System.out.println(myFamily.size());
      myFamily.replace("mohammad","mahmod");
     }
     
    public void merge(SigleLinkedList a2){
        this.getTailNode().setNext(a2.head);
//        Node currentNode = this.head;
//        SigleLinkedList mergedLists = new SigleLinkedList(this.head);
         
//            while (currentNode.getNext() != null) {
//                currentNode = currentNode.getNext();
//                mergedLists.add(currentNode);
//                
//            }
//            Node head2 = a2.getHeadNode();
//            currentNode.setNext(new Node(head2));
//            while (currentNode.getNext() != null) {
//                currentNode = currentNode.getNext();
//                mergedLists.add(currentNode);}
//        return mergedLists;
        
    }
}
