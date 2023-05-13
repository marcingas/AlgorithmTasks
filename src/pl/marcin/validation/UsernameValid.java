package pl.marcin.validation;

public class UsernameValid {
    public static void main(String[] args) {
        System.out.println(usernameValidator("u__hello_world123"));
    }

    public static String usernameValidator(String str) {
        boolean validation = (!(str.length() <= 25 && str.length() >= 4)) ?
                false : (!Character.isLetter(str.toCharArray()[0])) ?
                false : (!str.matches("[\\w_]+")) ?
                false : (str.toCharArray()[str.length() - 1] != '_') ? true : false;
        return Boolean.toString(validation);

    }
}
