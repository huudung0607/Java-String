import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else cnt--;
            if (cnt == 0) {
                ans = Math.max(ans, i + 1);
            }
            if (mp.containsKey(cnt)) {
                ans = Math.max(ans, i - mp.get(cnt));
            } else mp.put(cnt, i);
        }
        System.out.print(ans);
    }
}
