
package stack;



/**
 *
 * @author DELL
 */
public class stackMethod {

    public stackMethod() {
    }
    static int top=0;
    stackMethod [] stack = new stackMethod[5];

    /**
     *
     * @param element
     */
    public void push(Object element){
    
        stack[top].equals(element);
        top++;
    }
    
    public Object pop(){
        
        if(top==0)
            throw new RuntimeException("stack is empty !");

           //throw new EmptyStackException("stack is empty !");
       
        return stack[top--];
        
    }
    
    public Object peek(){
    
    
        if(top==0)
            throw new RuntimeException("stack is empty !");
    
     
        return stack[top];
    
        
    }
    
    public boolean empty(){
    
        if(top==0)
        return true;
        
         return false;
                 
    
    }
    public int search(Object element){
    
        int count=1;
        if(top==0)
            throw new RuntimeException("stack is empty !");
    
        for(int i=0;i<stack.length;i++){
           if( stack[i].equals(element))
               return count;
        }count++;
         throw new RuntimeException("could not found element !");
    }
    
    
}

