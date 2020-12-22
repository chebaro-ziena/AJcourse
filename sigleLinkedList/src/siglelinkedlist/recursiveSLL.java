/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siglelinkedlist;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class recursiveSLL <T>{
    Node head;
      public Node add(Node newElement){
    
        if(head== null)
        {return head= new Node(newElement);}
         
        
        else{
        return this.add(newElement,head);   
        
    }}
      
      public Node add(Node element,Node currentnode){
      
          if(currentnode.getNext()==null){
              currentnode.setNext(new Node (element));
               return element;}
          return this.add(element,currentnode.getNext());
      }
       public boolean isEmpty() {
        return this.head == null;
    }
       public int sise(){
       return size(head);
       }
      public int size(Node current) {
        if (isEmpty()||current.getNext()==null) {
            return 0;
     
        } else {
              int size=size(current.getNext());
                
            
            return 1+ size;}
        }

      public T get(int index){
      return get(head,index);
      
      }
      public T get (Node currentnode,int index){
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (isEmpty()) {
            throw new RuntimeException("Cannot fetch node, list is empty!");
        } else {
      
      }
              
              
}

    private int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


