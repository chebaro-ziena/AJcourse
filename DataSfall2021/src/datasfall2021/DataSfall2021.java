
package datasfall2021;

/**
 *
 * @author DELL
 */
public class DataSfall2021 {
   public static boolean check = false;
   public static void contains(int value,int Array[]){
       for(int i=0;i<Array.length;i++){
     
           if(Array[i]==value){
           check= true;
           break; 
                              
           }
           System.out.println(value+"is found");
       
  
           
           if(check=false) 
       

           System.out.println(value+"is not found");
       }}}