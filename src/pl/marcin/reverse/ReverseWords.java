package pl.marcin.reverse;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "As great Yogi Bear said it's aint over till its over";
        System.out.println(reverse(sentence));
    }

    public static String reverse(String sentence){
        String[]words = sentence.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}
