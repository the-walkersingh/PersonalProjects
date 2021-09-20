package CollectionFramework.Problems.BooksListSorting;
import java.util.Comparator;
public class PriceSort implements Comparator<Book>{
@Override
    public int compare(Book r1,Book r2) {
        int rate1=r1.getRate();
        int rate2=r2.getRate();
        return Integer.compare(rate1,rate2);
    }
}
