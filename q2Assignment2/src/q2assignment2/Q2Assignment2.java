
package q2assignment2;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Q2Assignment2 {

    public static String concat(int [] Array1,int [] Array2 ){
            int size= Array1.length+Array2.length;
            int s1=Array1.length;
            int s2=Array2.length;
            int[] newArray= new int[size];
            System.arraycopy (Array1, 0, newArray,0 , s1);
            System.arraycopy ( Array2,0,newArray,s1, s2);
            return  Arrays.toString(newArray); 
    }
    public static void main(String[] args) {
        int [] myGrades= {5,4,5,3,5};
        int [] myGrades2 ={5,4,5,3,2};
        
            
            
        
        System.out.println(concat(myGrades,myGrades2));
    }
    
}
