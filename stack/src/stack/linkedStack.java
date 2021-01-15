
package stack;



/**
 *
 * @author DELL
 */
public class linkedStack implements StackInterface{
    private Node top;
    public int size; 

    public linkedStack() {
        this.top = null;
        this.size = 0;
    }

    public linkedStack(int size) {
        this.size = size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void makeEmpty() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NullPointerException("Stack is empty. No values to show.");
        } else {
            return this.top.getValue();
        }
    }


    @Override
    public void push(Object value) {
        if (isEmpty()) {
            this.top = new Node(value);
        } else {
            
            Node newNode = new Node(value);
            newNode.setNext(this.top);
   
            this.top = newNode;
        }
        this.size++;
    }

    
    @Override
    public void pop() {
        if (isEmpty()) {
            throw new NullPointerException("Stack is empty. No values to remove.");
        } else if (size == 1) {
            makeEmpty();
        } else {
           
            Node nextNode = this.top.getNext();
            this.top = nextNode;
            this.size--;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node currentNode = this.top;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + "=> ");
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }
    }
     public linkedStack reverseStack(linkedStack original){
    
          int size = original.size;
          linkedStack reverse= new  linkedStack(size);
          while(!original.isEmpty()){
          reverse.push(original.peek());
          original.pop();
          
          }

          return reverse;
          
    }  
     public int indexOf (Object value){
     
     if (isEmpty()) {
            System.out.println("linkedStack is empty.");
        } else {
           int index = 0;
            while (!isEmpty()) {
                 Node currentNode = this.top;
                 
                if(currentNode.getValue().equals(value))
                {return index;}
                else{
                this.pop();
                index++;
                
            }
            
        }
     
     }
     
return -1;}



     public static void main(String[] args) {
        linkedStack linkedStack = new linkedStack();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);

        

        System.out.println("the index of 3 is "+linkedStack.indexOf(3) );
        

     }}
