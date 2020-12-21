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
      public Node add(Node head,T newElement){
    
        if(head== null)
        { head= new Node(newElement);}
        else{
         head.setNext(add(head.getNext(),newElement));   
    }return head;
    }
       public boolean isEmpty() {
        return this.head == null;
    }
      public int size(Node head,int count) {
        if (isEmpty()) {
            return 0;
     
        } else {
               size(head,count);
                count++;
            }
            return count;
        }


