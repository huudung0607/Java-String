import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String nt = sc.next();
            int ntk = sc.nextInt();
            mp.put(nt, ntk);
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            List<Map.Entry<String, Integer>> v = new ArrayList<>();
            for (int i = 0; i < s.length(); ) {
                StringBuilder element = new StringBuilder();
                if (Character.isLetter(s.charAt(i))) {
                    element.append(s.charAt(i));
                    i++;
                    if (i < s.length() && Character.isLowerCase(s.charAt(i))) {
                        element.append(s.charAt(i));
                        i++;
                    }
                }
                StringBuilder number = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    number.append(s.charAt(i));
                    i++;
                }
                int count = (number.length() == 0) ? 1 : Integer.parseInt(number.toString());
                v.add(new AbstractMap.SimpleEntry<>(element.toString(), count));
            }
            int total = 0;
            for (Map.Entry<String, Integer> x : v) {
                if (mp.containsKey(x.getKey())) {
                    total += mp.get(x.getKey()) * x.getValue();
                }
            }
            System.out.println(total);
        }
        sc.close();
    }
}
