package pl.marcin.mostlyrepetitive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostlyRepetitive {
    public static void main(String[] args) {
        int[]numbers = {3,3,3,3,2,1,1,1,1,2,2,2,5};
        List<Integer> result = findMostFrequent(numbers);
        for(int res : result){
            System.out.print(res + ", ");
        };
    }
    public static List<Integer> findMostFrequent(int[] numbers) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }
        List<Integer>mostFrequents = new ArrayList<>();

        int highestFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (freq > highestFrequency) {
                mostFrequents.clear();
                mostFrequents.add(num);
                highestFrequency = freq;
            }else if(freq == highestFrequency){
                mostFrequents.add(num);
            }
        }
        return mostFrequents;
    }
}
