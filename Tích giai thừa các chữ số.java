import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder res = new StringBuilder();

        for (char x : s.toCharArray()) {
            switch (x) {
                case '6':
                    res.append("35");
                    break;
                case '4':
                    res.append("322");
                    break;
                case '8':
                    res.append("2227");
                    break;
                case '9':
                    res.append("3327");
                    break;
                default:
                    if (x != '0' && x != '1') {
                        res.append(x);
                    }
                    break;
            }
        }

        // Convert to Character list for sorting with custom comparator
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < res.length(); i++) {
            chars.add(res.charAt(i));
        }

        chars.sort(Collections.reverseOrder());

        StringBuilder sortedRes = new StringBuilder();
        for (char c : chars) {
            sortedRes.append(c);
        }

        System.out.print(sortedRes.toString());
    }
}
