package tasks;

public class PasswordValidationTask {

    public static void main(String[] args) {
        System.out.println(PasswordValidation("Lawanginha1!"));

    }

    public static boolean PasswordValidation(String password) {

        String lowercase = "(.*[a-z].*)", uppercase = "(.*[A-Z].*)";

        String numbers = "(.*[0-9].*)", specialChars = "(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase),

                HasUpperCase = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialChars),

                Valid = false;

        if (password.length() >= 6 && !password.contains(" ") && HasLower && HasUpperCase && HasDigits && HasSpecial)

            Valid = true;

        return Valid;

    }
}
