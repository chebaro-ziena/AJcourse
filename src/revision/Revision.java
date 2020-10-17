
package revision;
import java.util.Arrays;
import java.util.Scanner;

public class Revision {
    
  
    public static void main(String[] args) {
        
       Scanner x=new Scanner(System.in);
      
       System.out.println("Enter the number of movies to be rated:");
       int nm=x.nextInt();
       String [] Movies = new String[nm] ;
       int [] Average = new int[nm] ;
       int [] Max = new int[nm] ;
       int [] Min = new int[nm] ;
        int MaxAverage=0;
        String MaxAverageMovieName = "";

       for(int i=0;i<nm;i++){
          
       System.out.println("Enter the name of movie "+(i+1));
       String s=x.next();
       Movies[i]=s;
              
       }
         System.out.println("Enter the number of attendees:");
         int NumberOfAttendees =x.nextInt();
    
         for(int f=0;f<NumberOfAttendees;f++){
         System.out.println("Welcome to Cinema Critics!");
         int [] Ratings = new int[nm];
         for(int j=0;j< nm;j++){
                System.out.println("Please, enter a rating between 1 and 5 for "+Movies[j]);
               int n;
                 do
                {
                n= x.nextInt();
                Ratings[j]=n;
                if(n<1 || n>5)
                System.out.println("Please, enter a valid rating!");
                }
                while(n<1 || n>5);
        if (Ratings[j] > Max[j]) 
            Max[j] = Ratings[j]; 
  
        if (Ratings[j] < Min[j] || Min[j] ==0) 
           Min[j] = Ratings[j];
        
         Average[j]= (Min[j] + Max[j])/2;
          
         if(Average[j]> MaxAverage)
         {
             MaxAverage = Average[j];
             MaxAverageMovieName = Movies[j];
         }
         
            }
        System.out.println("Thanks!");
        }
        
         System.out.println("Here are the results:\n");
         for(int j=0;j<nm;j++)
         {
          System.out.println(Movies[j]+'\t'+Average[j]+'\t'+Max[j]+'\t'+Min[j]);
         }
         System.out.println("The Winner movie is "+MaxAverageMovieName);
//System.out.format("%32s%10d%16s", string1, int1, string2);

    }
         
         

}
         

       
        
               
             
                
        
        
    
