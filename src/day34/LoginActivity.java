package day34;

public class LoginActivity {
    public static void main(String[] args) {
        login1("user", "abc123");
        login2("user", "abc123");
    }

    public static void login1(String userName, String password) {
        if (userName.equals("user") && password.equals("abc123")) {
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }
    }

    public static boolean login2(String userName, String password) {
//        if (userName.equals("user") && password.equals("abc123")) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        return userName.equals("user") && password.equals("abc123");
    }
}


