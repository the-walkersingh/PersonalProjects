//Create movie objects which will have name, director_name, duration, rating. Later put these objects in HashSet.
package CollectionFramework.Problems.MovieListSorting;
import java.util.ArrayList;
import java.util.LinkedList;

public class MovieList {

    String name;
    String director;
    double length;
    int rating;

    public MovieList(String name, String director, double length, int rating) {
        this.name = name;
        this.director = director;
        this.length = length;
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }

    public String toString(){
        return  "Below are the details of Movie: \n"+
                "Name       : "+ name	+" \n"+
                "Director   : "+ director+"\n"+
                "Length     : "+ length	+" \n"+
                "Rating     : "+ rating	+" \n\n" ;
    }
}

//------------------------------------------------------------------------------------------------------
class Mainclass{
        public static void main(String[] args) {
            MovieList m1=new MovieList("Sholey","Shree",3,7);
            MovieList m2=new MovieList("Batman","Hari",3.3,9);
            MovieList m3=new MovieList("Thor","Class",2.4,10);
            MovieList m4=new MovieList("Spider-man","Super",3.1,6);
            MovieList m5=new MovieList("Logan","Super",3.1,8);

            LinkedList<MovieList> e= new LinkedList<MovieList>();//int[] marks=new int[]
            e.add(m1);                              //marks.add(34)
            e.add(m2);                              //marks.add(56)
            e.add(m3);
            e.add(m4);
            e.add(m5);
//            System.out.println(e);
            System.out.println("************Below I have used For Each loop Method***********");
            for (MovieList m:e){
                System.out.println(m);
            }
            System.out.println("***********Below are the movies Rating greater then 6*********");
            for (MovieList m:e){
                if(m.getRating()>8)
                System.out.println(m);
            }
        }
}

