package CollectionFramework.Problems.BooksListSorting;

import java.util.Comparator;

public class AuthorSort implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {

        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();

        return author1.compareToIgnoreCase(author2);
    }
}