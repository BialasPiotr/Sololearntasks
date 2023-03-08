import java.util.*;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");
        String result = longestCommonSubstring(words);
        System.out.println(result);
    }
    public static String longestCommonSubstring(String[] words) {
        String first = words[0];
        int n = words.length;
        int len = first.length();
        String longest = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = first.substring(i, j);
                int k;
                for (k = 1; k < n; k++) {
                    if (!words[k].contains(substring)) {
                        break;
                    }
                }
                if (k == n && substring.length() > longest.length()) {
                    longest = substring;
                } else if (k == n && substring.length() == longest.length()) {
                    if (substring.compareTo(longest) < 0) {
                        longest = substring;
                    }
                }
            }
        }
        return longest;
    }
}
