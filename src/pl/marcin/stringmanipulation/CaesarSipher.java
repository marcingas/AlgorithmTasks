package pl.marcin.stringmanipulation;

public class CaesarSipher {
    public static void main(String[] args) {
        System.out.println(caesarSipherChanger("Hello World, and me",1));
    }
    public static String caesarSipherChanger(String sentence, int num){
       String result = "";
        for(char letter : sentence.toCharArray()){
            if(Character.isLetter(letter)){
                letter = (char) (letter + num);
               result = result.concat(Character.toString(letter));


            }else{
                result = result.concat(Character.toString(letter));
            }
        }


        return result;
    }
}
