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
public class zeinamidtermArraylist extends Arraylist {
     
        public boolean doesNotContain(Arraylist anotherList){ 
        
            for(int i=0;i<anotherList.size();i++){
            if(this.contains(anotherList.get(i)))
                return false;
                }
               return true;
        }
        
        public Arraylist getDistinct(Arraylist anotherList){
        
         Arraylist resultList = new Arraylist(this.size()+anotherList.size());
 
         for(int i=0;i<this.size();i++){
             resultList.add(A[i]);
             
         }
         for(int i=0;i<anotherList.size();i++){
             if(!this.contains(anotherList.get(i)))
              resultList.add(anotherList.get(i));
         }
        
        return resultList;
        
        
        }
    
        public static void main(String[] args) {
    Arraylist a = new Arraylist(5);
    Arraylist b = new Arraylist(3);
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");
    a.add("e");
    b.add("e");
    b.add("f");
    b.add("a");
    Arraylist result= a.reverse();
    result.print(); 
    }
}
