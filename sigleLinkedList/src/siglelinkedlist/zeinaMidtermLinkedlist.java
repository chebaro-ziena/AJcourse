/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siglelinkedlist;

/**
 *
 * @author DELL
 */
public class zeinaMidtermLinkedlist extends SigleLinkedList {
    
    public Object getMiddle(){
        
        if(this.head == null)
              return null; 
    
        int n=this.size();
        if(n%2==0){
            
        int index= n/2 ;
            Node currentNode = this.head;
            int i = 0;
            while (currentNode != null) {
                if (i == index) {
                    return currentNode;
                }
                i++;
                currentNode = currentNode.getNext();
            }}
        if(n%2==1){
            
           int index1 = (n-1)/2 ;
            Node currentNode = this.head;
            int j = 0;
            while (currentNode != null) {
                if (j == index1) {
                    return currentNode;
                }
                j++;
                currentNode = currentNode.getNext();
    
    }}
    
    }

     
     public static void main(String[] args) {
       

     
     
     
     }

}
