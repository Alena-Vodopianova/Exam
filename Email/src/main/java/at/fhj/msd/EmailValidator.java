package at.fhj.user;

public class EmailValidator {
    public static boolean isValid(String email) {
        return email.startsWith("@") && email.endsWith(".com");
    }
}