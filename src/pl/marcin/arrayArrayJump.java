package pl.marcin;

public class arrayArrayJump {
    public static void main(String[] args) {
        System.out.println(ArrayMinJump(new int[]{3,5,4,1,1,1,7,0,1,3}));
    }
    public static int ArrayMinJump(int[]arr){
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        if (currentJumpEnd < arr.length - 1) {
            return -1;
        }
        return jumps;
    }
}
