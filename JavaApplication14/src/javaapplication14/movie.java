
package javaapplication14;
        
        public class dbmovie{

    private static final int BUFFER_SIZE = 2;
    int effectiveNbMovies = 0;
    Movie[] moviesList = new Movie[BUFFER_SIZE];
    
    
    public void add(Movie movie) {
        
        if (moviesList.length == effectiveNbMovies) {
            Movie[] NewmoviesList = new Movie[BUFFER_SIZE*2];
            System.arraycopy(movieList,0,NewmoviesList,0);
            
              // or the most known way 
            // for (int i = 0; i < movieList.length; i++) {
           //   NewmovieList[i] = moviesList[i];
           
            NewmovieList[effectiveNbMovies] = movie;
       
            effectiveNbMovies++;
      }
            moviesList[effectiveNbMovies] = movie;
        
            effectiveNbMovies++;
}   

    void display() {
        // Equivalent to
//        for (int i = 0; i < moviesList.length; i++) {
//            Movie movie = moviesList[i];
//            System.out.println("Movie: " + movie.getName() + ", " + movie.getReleaseYear());
//        }
        // for each variable "movie" of type "Movie" in "moviesList", do...
        for (Movie movie : moviesList) {
            System.out.println("Movie: " + movie.getName() + ", " + movie.getReleaseYear());
        }
    }
     public static String remove( Movie removedMovie,movie[]) {
 
         for (int i = 0; i < movie.length; i++) {
         
             if (movie[i].equals(removedMovie)) {
             int   index = i;
             movie[index]==null;
               break;
            }
        }
        if (index >= 0) {
            Movie[] NewmoviesList = new Movie[movie.length - 1];
            for(int i=0,j=0;i < movie.length;i++,j++){
                if(movie[i]!=null)
            
                    NewmoviesList[j]=movie[i]
                    effectiveNbMovies--;
            
            }
        }
        
       
        return NewmoviesList;
}