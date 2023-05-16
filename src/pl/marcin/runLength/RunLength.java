package pl.marcin.runLength;

import java.io.CharArrayReader;
import java.util.HashMap;
import java.util.Map;

public class RunLength {
    public static void main(String[] args) {
//        method should return number of reapeat and letter 2a2b1c1d1e
        System.out.println(runLengthChanger("aabbcde"));
    }

    public static String runLengthChanger(String str) {
        Map<Character, Integer> map = new HashMap<>();
        String result = "";
        char[] singleChar = str.toCharArray();
        for (char letter : singleChar) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for (char key : map.keySet()) {
            result = result.concat(Integer.toString(map.get(key))).concat(Character.toString(key));
        }
        return result;
    }
}
