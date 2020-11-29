
package arraylist;

import java.util.List;
/**
 *
 * @author DELL
 */
public class QuizDSZeina extends Arraylist {
    
    
    
      public Object get(int index) {
          if (index >= size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return A[index];
    
    }
    public int countOccurrences(Object element){
        int count=0;
        for(int i=0;i<A.length;i++){
        
            if(this.get(i).equals(element))
                count++;
        }
    
        return count;
    
    }

    
  
    public static void main(String[] args) {
    Arraylist a = new Arraylist(5);
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");
    a.add("b");
    System.out.println(a.countOccurrences("b")); 
 
    a.print();
    
    
    
    }
    }

