package CollectionFramework.Problems.MemoryCard;

import java.util.Comparator;

public class RatingSort implements Comparator<Memory> {
    public int compare(Memory r1, Memory r2) {
        //Naive way to compare:
//        int rate1=r1.getRate();
//        int rate2=r2.getRate();
//        return Float.compare(rate1,rate2);
        //Shortcut way
        return Float.compare(r1.rate, r2.rate);
    }
}
