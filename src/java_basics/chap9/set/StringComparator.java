package java_basics.chap9.set;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    /*
        ascending
     * return 0 if o1=o2
     * return <0 if o1<o2
     * return >0 if o1>o2
     * 
     * descending
     * flip -()
     */
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
            return o1.compareTo(o2);//alphabetical order
        }
        return -(o1.length() - o2.length());//added the -() for descending order
    }

}
