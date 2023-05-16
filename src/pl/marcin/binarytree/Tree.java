package pl.marcin.binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tree {
    public static void main(String[] args) {
        String []strArr = new String[]{"(1,2)","(3,2)","(2,12)","(5,2)"};
        System.out.println(TreeConstructor(strArr));

    }
    public static String TreeConstructor(String[]strArr){
         Set<String> children = new HashSet<>();
        Map<String,Integer> parents = new HashMap<>();

        for(String node: strArr){
            String[]values = node.replaceAll("[^0-9,]","").split(",");
            children.add(values[0]);
            Integer count = parents.get(values[1]);
            if(count != null && count +  1 > 2 ){
                return "false";
            } else{
                parents.put(values[1],(count == null ? 1 : ++count));
            }
        }
        return "" + (children.size() == strArr.length);
    }
}
