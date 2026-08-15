import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
 
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            currentSum = Math.max(value, currentSum + value);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);

        sc.close();
    }
}
