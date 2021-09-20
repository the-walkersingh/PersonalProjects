package CollectionFramework.Problems.MemoryCard;

import java.util.Comparator;

//Here we are comparing and sorting the storage
public class StorageSort implements Comparator<Memory> {
    public int compare(Memory s1, Memory s2) {
        //Below is the naive way to compare :
//        int store1 = s1.getStorage();
//        int store2 = s2.getStorage();
//        return Integer.compare(store1,store2);

        //This is the professional type of comparison using less code
        return Integer.compare(s1.storage, s2.storage);
    }
}
