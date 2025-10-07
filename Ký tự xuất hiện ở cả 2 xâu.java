import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> mp = new HashMap<>();
        Set<Character> giao = new TreeSet<>();
        String a = sc.next();
        String b = sc.next();

        for (int i = 0; i < a.length(); i++) {
            mp.put(a.charAt(i), 1);
            giao.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            giao.add(ch);
            if (mp.getOrDefault(ch, 0) == 1) {
                mp.put(ch, 2);
            }
        }
        Set<Character> hop = new TreeSet<>();
        for (int i = 0; i < a.length(); i++) {
            if (mp.get(a.charAt(i)) != null && mp.get(a.charAt(i)) == 2) {
                hop.add(a.charAt(i));
            }
        }
        for (char x : hop) {
            System.out.print(x);
        }
        System.out.println();
        for (char x : giao) {
            System.out.print(x);
        }
    }
}
