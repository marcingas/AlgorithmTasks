package pl.marcin.matrix;


public class VowelSquare {
    public static void main(String[] args) {
String[]letters = {"a,q,r,s,t","u,k,a,e,i","f,f,o,o,o"};

        System.out.println(findVowelSquare(letters));
    }


    public static String findVowelSquare(String[] letters) {
        String[]changedLetters = new String[letters.length];
        for(int i = 0; i < letters.length; i++){
            changedLetters[i]=letters[i].replaceAll(",","");
        }
        String searched = "not found";
        String count = letters[0].replaceAll(",","");
        System.out.println(count);
        System.out.println(count.length());
        char[][] array = new char[letters.length][count.length()];

        char[] belongs = {'a', 'e', 'i', 'o', 'u', 'y'};

        for (int row = 0; row < letters.length; row++) {
            for (int col = 0; col < count.length(); col++) {
                array[row][col] = changedLetters[row].toLowerCase().charAt(col);
            }
        }
        for (int row = 0; row < letters.length - 1; row++) {
            for (int col = 0; col < count.length() - 1; col++) {
                if (contains(belongs, array[row][col]) && contains(belongs, array[row][col + 1])
                        && contains(belongs, array[row + 1][col]) && contains(belongs, array[row + 1][col + 1])) {
                    searched = row + "-" + col;
                    break;
                }
            }
        }
        return searched;
    }

    public static boolean contains(char[] arr, char item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }
}

