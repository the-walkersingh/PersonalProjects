package CollectionFramework.Problems.BooksListSorting;

import java.util.Comparator;

public class RatingSort implements Comparator<Book> {
    @Override
    public int compare(Book r1,Book r2) {
        int rating1=r1.getRating();
        int rating2=r2.getRating();
        return Integer.compare(rating1,rating2);
    }
}
