package CollectionFramework.Problems.BooksListSorting;
/* Create class Book with
    fields: name,author, publisher, price,rating
    now wap to sort the list with the user requirement
 */
public class Book {
    String name;
    String author;
    String publisher;
    int rate;
    int rating;
//default constructor
    public Book() {
        System.out.println("This is a default constructor");
    }
//parameterized constructor
    public Book(String name, String author, String publisher, int rate, int rating) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.rate = rate;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getRate() {
        return rate;
    }

    public int getRating() {
        return rating;
    }

    //toString
public String toString(){
    return
            "Book Name	        : "+name 	+" \n"+
            "Author Name 	    : "+author 	+"	\n"+
            "Publishing House 	: "+publisher +" \n"+
            "Price  	            : "+rate 	+" Rs\n"+
            "Rating 	            : "+rating 	+" Star\n";
}
}
