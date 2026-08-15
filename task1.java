import java.util.*;
import java.util.stream.*;

public class task1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        List<Integer> updatedSalaries = salaries.stream()
                .map(salary -> (int) (salary * 1.10))
                .collect(Collectors.toList());

        for (int salary : updatedSalaries) {
            System.out.print(salary + " ");
        }

        sc.close();
    }
}