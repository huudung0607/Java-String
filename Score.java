import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static List<String> getString(String s) {
        List<String> v = new ArrayList<>();
        Scanner sc = new Scanner(s);
        while (sc.hasNext()) {
            v.add(sc.next());
        }
        sc.close();
        return v;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> mp = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            int index = s.indexOf('-');
            String X = s.substring(0, index - 1);
            String Y = s.substring(index + 2);
            List<String> v1 = getString(X);
            List<String> v2 = getString(Y);
            StringBuilder team1 = new StringBuilder();
            StringBuilder team2 = new StringBuilder();
            for (int i = 0; i < v1.size() - 1; i++) {
                team1.append(v1.get(i)).append(" ");
            }
            for (int i = 1; i < v2.size(); i++) {
                team2.append(v2.get(i)).append(" ");
            }
            team1.setLength(team1.length() - 1);
            team2.setLength(team2.length() - 1);
            mp.put(team1.toString(), mp.getOrDefault(team1.toString(), 0) + Integer.parseInt(v1.get(v1.size() - 1)));
            mp.put(team2.toString(), mp.getOrDefault(team2.toString(), 0) + Integer.parseInt(v2.get(0)));
        }
        List<Map.Entry<String, Integer>> v = new ArrayList<>(mp.entrySet());
        v.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });
        for (Map.Entry<String, Integer> x : v) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
