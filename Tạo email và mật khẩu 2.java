import java.util.*;
import java.io.*;

public class Main {
    static final String mail = "@xyz.edu.vn";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> mp = new HashMap<>();

        while (n-- > 0) {
            String a = br.readLine().toLowerCase();
            String[] parts = a.split("\\s+");
            List<String> v = Arrays.asList(parts);

            StringBuilder emailBuilder = new StringBuilder(v.get(v.size() - 2));
            for (int i = 0; i < v.size() - 2; i++) {
                emailBuilder.append(v.get(i).charAt(0));
            }
            String email = emailBuilder.toString();

            mp.put(email, mp.getOrDefault(email, 0) + 1);
            if (mp.get(email) == 1) {
                System.out.println(email + mail);
            } else {
                System.out.println(email + mp.get(email) + mail);
            }

            String ns = v.get(v.size() - 1);
            String[] dateParts = ns.split("/");
            for (String w : dateParts) {
                System.out.print(Integer.parseInt(w));
            }
            System.out.println();
        }
    }
}
