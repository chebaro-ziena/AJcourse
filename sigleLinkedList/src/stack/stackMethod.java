
package stack;



/**
 *
 * @author DELL
 */
public class stackMethod <T>{

    public stackMethod() {
        top=-1;
    }
     int top=0;
    stackMethod<T> [] stack = new stackMethod[5];

    /**
     *
     * @param element
     */
    public void push(T element){
    
        top++;
        stack[top]=(stackMethod<T>) element;
        
    }
    
    public T pop(){
        
        if(top==-1)
            throw new RuntimeException("stack is empty !");

           //throw new EmptyStackException("stack is empty !");
       
        return (T) stack[top--];
        
    }
    
    public T peek(){
    
    
        if(top==0)
            throw new RuntimeException("stack is empty !");
    
     
        return (T) stack[top];
    
        
    }
    
    public boolean empty(){
    
        if(top==0)
        return true;
        
         return false;
                 
    
    }
    public int search(T element){
    
        int count=1;
        if(top==-1)
            throw new RuntimeException("stack is empty !");
    
        for(int i=0;i<stack.length;i++){
           if( stack[i].equals(element))
               return count;
        }count++;
         throw new RuntimeException("could not found element !");
    }
    
    public void copy(){
     if (top==-1) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + "=> ");
            }
            System.out.println();
        }}
    
     public void reverseCopy(){
     if (top==-1) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i<=top; i++) {
                System.out.print(stack[i] + "=> ");
            }
            System.out.println();
        }}
     
     public void recursiveCopy(int top){
     if (top==-1) {
            System.out.println("Stack is empty.");
        } else{
                System.out.print(stack[top] + "=> ");
                recursiveCopy(top--);
            }
            System.out.println();
        }

    public void recorsiveReversecopy(int top,int i){
     if (top==-1) {
            System.out.println("Stack is empty.");
        } else{
         if(i<=top)
                System.out.print(stack[i] + "=> ");
                recorsiveReversecopy(top,i++);
            }
            System.out.println();
        }
}

