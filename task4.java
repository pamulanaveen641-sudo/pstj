 import java.util.*;

public class task4 {

    static int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    static void KMPSearch(String text, String pattern) {

        if (pattern.length() == 0) {
            return;
        }

        int n = text.length();
        int m = pattern.length();

        int[] lps = buildLPS(pattern);

        int i = 0;
        int j = 0;

        StringBuilder result = new StringBuilder();

        while (i < n) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                result.append(i - j).append(" ");
                j = lps[j - 1];

            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            String text = sc.nextLine().trim();
            String pattern = sc.nextLine().trim();

            KMPSearch(text, pattern);
        }
    }
}
