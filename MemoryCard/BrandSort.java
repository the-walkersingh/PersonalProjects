package CollectionFramework.Problems.MemoryCard;

import java.util.Comparator;

//Here we have written code to compare the Brand names
public class BrandSort implements Comparator<Memory> {
    @Override
    public int compare(Memory n1, Memory n2) {
//        String name1=n1.getBname();
//        String name2=n2.getBname();
//        return name1.compareToIgnoreCase(n2.getBname());
// this is the shortcut method to compare the code
        return String.CASE_INSENSITIVE_ORDER.compare(n1.bname, n2.bname);
    }


}
