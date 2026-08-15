import java.util.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class task9{

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            String operator = sc.next();
            int b = sc.nextInt();

            Calculator calculator = new Calculator();
            int actual;
            int expected;

            if (operator.equals("+")) {
                actual = calculator.add(a, b);
                expected = a + b;
            } else if (operator.equals("/")) {
                if (b == 0) {
                    System.out.println("Test Failed");
                    return;
                }

                actual = calculator.divide(a, b);
                expected = a / b;
            } else {
                System.out.println("Test Failed");
                return;
            }

            if (actual == expected) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
            }
        }
    }
}
