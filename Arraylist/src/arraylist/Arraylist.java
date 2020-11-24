
package arraylist;

import java.util.List;

/**
 *
 * @author DELL
 */
public abstract class Arraylist implements List<Object> {

   List[] A = new Arraylist[10];
  

    @Override
    public int size() {
        return A.length;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        for(int i=0;i<A.length;i++){
        
            if(A[i].equals(o))
                return true;
        }
        return false;
        
    }

    @Override
    public boolean add(Object e) {
        // 1- create an array that is one item bigger than the current array

        final Object T[]  = new Arraylist[A.length + 1];

        // 2- copy previous elements in their right order
        for (int i = 0; i < A.length; i++) {
            T[i] = A[i];
        }

        // 3- add the new item given in parameter at the end of the new array
        T[A.length] = e;

        
        return true;
    }

    @Override
    public boolean remove(Object o) {
       
        for (int i = 0; i < A.length; i++) {
           if(A[i].equals(o))
            return false;
        }

       return true;

    }

    @Override
    public Object get(int index) {
          if (index >= size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return A[index];
    
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int index) {
        if (index >= size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // 1- create a new array that is 1 item smaller
        Object T[]  =  new Arraylist[A.length - 1];

        for (int i = 0; i < A.length; i++) {
            if (i < index) {
                // 2- copy all the item up until index-1 from old to same position in new
                T[i] = A[i];
            }
            if (i > index) {
                // 3- copy all items from inex+1 up to size-1 from old to one position ahead in the new
                T[i - 1] = A[i];
            }
        }
        Object removedItem = A[index];
        
        // 5- return the removed item
        return removedItem;
    }

    @Override
    public int indexOf(Object o) {
         for (int i = 0; i < A.length; i++) {
           if(A[i].equals(o))
               return i;
           
    }
        // throws new Exception("the element does not exist");
    return -1;
}}
