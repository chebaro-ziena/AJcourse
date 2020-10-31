
package assignment.pkg2.lab;

/**
 *
 * @author DELL
 */
        
import java.util.Scanner;
public class Assignment2Lab {
   
    public static boolean result= false;
    
    
   
   
    

     public static boolean isAscending(int arr[], int n)
    {
      
        if (n == 1 || n == 0)
            return result=true;
 
        
        if (arr[n - 1] < arr[n - 2])
            return result;
 
        
        return isAscending(arr, n -1);
    }
    
    
    public static void main(String[] args){
    int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
        if (isAscending(arr, n) != false)
            System.out.println("Yes The array is increasing");
        else
            System.out.println("No the array is not increasing");
        
       
           
            
                
              
            }
        
        
        }
    


    
        


    
    

