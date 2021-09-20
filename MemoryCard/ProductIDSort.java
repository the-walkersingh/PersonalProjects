package CollectionFramework.Problems.MemoryCard;

import java.util.Comparator;

public class ProductIDSort implements Comparator<Memory> {
    public int compare(Memory i1, Memory i2) {
        //Shortcut way
        return Integer.compare(i1.getProductid(), i2.getProductid());
    }
}
