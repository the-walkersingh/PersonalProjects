package CollectionFramework.Problems.MemoryCard;

import java.util.Comparator;

public class PriceSort implements Comparator<Memory> {
    public int compare(Memory p1, Memory p2) {
        //Naive way to compare:
//        int rate1=r1.getRate();
//        int rate2=r2.getRate();
//        return Float.compare(rate1,rate2);
        //Shortcut way
        return -Integer.compare(p1.price, p2.price);
    }
}
