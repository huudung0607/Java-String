import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> mp = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        int maxval = -1;
        char maxchar = 0;
        for (Map.Entry<Character, Integer> x : mp.entrySet()) {
            if (x.getValue() > maxval || (x.getValue() == maxval && x.getKey() > maxchar)) {
                maxval = x.getValue();
                maxchar = x.getKey();
            }
        }
        System.out.println(maxchar + " " + maxval);
        int minval = 100000;
        char minchar = 0;
        for (Map.Entry<Character, Integer> x : mp.entrySet()) {
            if (x.getValue() < minval || (x.getValue() == minval && x.getKey() > minchar)) {
                minchar = x.getKey();
                minval = x.getValue();
            }
        }
        System.out.println(minchar + " " + minval);
        scanner.close();
    }
}
