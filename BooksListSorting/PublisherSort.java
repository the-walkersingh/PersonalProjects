package CollectionFramework.Problems.BooksListSorting;
import java.util.Comparator;
public class PublisherSort implements Comparator<Book> {
//    public int compare(Book o1, Book o2) {
//
//        String publisher1 = o1.getPublisher();
//        String pubhlisher2 = o2.getPublisher();
//
//        return publisher1.compareToIgnoreCase(pubhlisher2);
//    }
@Override
    public int compare(Book o1,Book o2) {
        String publisher1=o1.getPublisher();
        String publisher2=o2.getPublisher();
        return publisher1.compareToIgnoreCase(publisher2);
    }
}