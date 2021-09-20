package CollectionFramework.Problems.BooksListSorting;
import java.util.Comparator;
public class NameSort implements Comparator<Book>{
    public int compare(Book n1, Book n2){
        String name1 = n1.getName();
        String name2 = n2.getName();
        return name1.compareToIgnoreCase(name2);
    }
}
