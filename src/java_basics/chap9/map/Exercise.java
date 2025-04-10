package java_basics.chap9.map;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        String text = "Are you ready for the exam?" +
                "\n The exam is very very very interesting." +
                "\n Ready? The interesting exam will be in 16 days.";
        StringTokenizer st = new StringTokenizer(text, " .,?!;:\n");
        // key = word (string) and value = occurence(Integer)
        // entry = key ,value = word , occurence
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase();
            int value = 1;
            if (map.containsKey(word)) {
                value = map.get(word);// return value =( number of occurences of word)
                value++;
            }
            map.put(word, value);

        } // end of while
        System.out.println(map);
    }
}
