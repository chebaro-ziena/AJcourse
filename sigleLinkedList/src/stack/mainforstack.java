
package stack;

/**
 *
 * @author DELL
 */
public class mainforstack {
     public static void main(String[] args) {
     
         stackMethod[] myCDs =new stackMethod[5];
         myCDs.push("movie");
         myCDs.push("song");
         myCDs.push("movie2");
         myCDs.pop();
         System.out.println(""+myCDs.peek());
         System.out.println(""+myCDs.search("song"));
         
         
     
     
     
     }
}
