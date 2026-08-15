import java.util.Scanner;

public class task10 {

    static boolean authenticate(String username, String password) {

        // Boundary value validation
        if (username.length() < 3 || username.length() > 20) {
            return false;
        }

        if (password.length() < 6 || password.length() > 20) {
            return false;
        }

        // Example valid credentials
        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                String username = sc.next();
                String password = sc.next();

                try {
                    if (authenticate(username, password)) {
                        System.out.println("SUCCESS");
                    } else {
                        System.out.println("FAILURE");
                    }
                } catch (Exception e) {
                    System.out.println("FAILURE");
                }
            }
        }
    }
}
