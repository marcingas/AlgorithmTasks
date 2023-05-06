package pl.marcin.sumpair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumPair {
    public static void main(String[] args) {
        int[]array = {14,2,12,4,15,12,1,13,3,11};
        int targetSum = 15;
        List<int[]> pairs = findPairs(array,targetSum);
        for(var p : pairs){
            System.out.println(p[0] + ", " + p[1]);
        }
    }

    public static List<int[]> findPairs(int[] array, int targetSum) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> checkedNumbers = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int serached = targetSum - array[i];
            if (checkedNumbers.containsKey(serached)) {
                int[] pair = {array[i], serached};
                result.add(pair);
            }
            checkedNumbers.put(array[i], i);
        }
        return result;
    }
}
