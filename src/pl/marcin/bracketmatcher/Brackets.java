package pl.marcin.bracketmatcher;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(bracketMatcher("(one) and (two) equals (ane and two)"));
    }
    public static int bracketMatcher(String fraze) {
        int count = 0;
        for (int i = 0; i < fraze.length(); i++) {
            if (fraze.charAt(i) == '(') {
                count++;
            } else if (fraze.charAt(i) == ')') {
                count--;
            }
        }
        if(count>0){
            return 0;
        }else if(count < 0){
            return 0;
        }else {
            return 1;
        }
    }
}
