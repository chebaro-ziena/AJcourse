/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author DELL
 */
public class Quiz1 extends Node {
    
    

     public Object getPrevious(Object element){
        Node preNode= new Node();     
        Node currentNode = head;
         int index = 0;
         Node requestedNode= new Node();
    
        while(currentNode.getNext()!=null){ 
       
            if(currentNode.getValue().equals(element)) {
                requestedNode= currentNode;
            }
             currentNode = currentNode.getNext();
             index++;
        }
        
        if(requestedNode.equals(head))
            return null;
        
        Node currentNode2 = this.head;
            int i = 0;
            while (currentNode !=null ) {
                if (i == index-1) {
                    preNode = currentNode;
                }
                i++;
                currentNode = currentNode.getNext();
        
    return preNode;
    
    }
    
}}
