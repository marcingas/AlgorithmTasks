package pl.marcin.hasdifference;

import java.util.Arrays;

public class Difference {
    public static void main(String[] args) {
        int[] num = {3,1,2,3,4,5,6,7};
        System.out.println(hasDifference(num, 6));
    }
    public static boolean hasDifference(int[]nums, int k){
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while(i < nums.length && j < nums.length){
            if(i != j && nums[j] - nums[i] == k){
                System.out.println(nums[j] + " - "  + nums[i] +" = " + k);
                return true;
            } else if(nums[j] - nums[i] < k){
                j++;
            }else{
                i++;
            }
        }
        return false;
    }
}
