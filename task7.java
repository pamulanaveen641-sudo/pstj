import java.util.*;

public class task7 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            Map<String, Integer> frequency = new LinkedHashMap<>();

            for (int i = 0; i < n; i++) {
                String hashtag = sc.next();

                frequency.put(
                    hashtag,
                    frequency.getOrDefault(hashtag, 0) + 1
                );
            }

            for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
