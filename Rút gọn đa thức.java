import java.util.*;
import java.io.*;

public class Main {
    public static String thugon(String s) {
        Map<Integer, Integer> mp = new TreeMap<>();
        Scanner sc = new Scanner(s);
        while (sc.hasNext()) {
            String w = sc.next();
            if (w.equals("+")) {
                continue;
            }
            int pos = w.indexOf("x^");
            int num = Integer.parseInt(w.substring(0, pos));
            int somu = Integer.parseInt(w.substring(pos + 2));
            mp.put(somu, mp.getOrDefault(somu, 0) + num);
        }
        sc.close();

        StringBuilder res = new StringBuilder();
        boolean find = true;
        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            if (x.getValue() == 0) {
                continue;
            }
            if (!find) {
                res.append(" + ");
            }
            res.append(x.getValue()).append("x^").append(x.getKey());
            find = false;
        }
        return res.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            System.out.println(thugon(s));
        }
    }
}
