package pl.marcin.longestWord;

public class Words {
    public static void main(String[] args) {
        System.out.println(longestWords("Hello 1234Hellooo Dear dead"));
    }
    public static String longestWords(String sentence){
        String[] arr = sentence.split(" ");
        int maxLength = 0;
        String maxWord="";
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            word = arr[i].replaceAll("[^a-zA-Z]", "");
            int wordLenght = word.length();
            if (wordLenght > maxLength) {
                maxLength = wordLenght;
                maxWord = word;
            }

        }
        return maxWord;
    }
}
