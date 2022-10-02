package validator;

import java.util.regex.*;

public class Validator {
    private static String regex = "^(.+)@(.+)$";

    private static Pattern emailPattern = Pattern.compile(regex);

    public static boolean validateEmail(String email) {
        Matcher matcher = emailPattern.matcher(email);
        return matcher.matches();
    }
}
