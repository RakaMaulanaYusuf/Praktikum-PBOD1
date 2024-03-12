// NAMA : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : UserInputValidator.java

public class UserInputValidator {
    public static void validateUsername(String username) {
        assert username != null && username.matches("^[a-zA-Z][a-zA-Z0-9_]{5,19}$") : "Username must be between 6 and 20 characters long";
    }    

    public static void validateEmail(String email) {
        assert email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}") : "Invalid email address";
    }

    public static void validateAge(int age) {
        assert age >= 17 && age <= 99 : "Age must be between 17 and 99";
    }
}


  