import java.util.*;
import java.io.*;

public class Main {
    static final String mail = "@xyz.edu.vn";
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> mp = new HashMap<>();
        while (n-- > 0) {
            String a = sc.nextLine().toLowerCase();
            String[] parts = a.split("\\s+");
            List<String> v = Arrays.asList(parts);

            StringBuilder email = new StringBuilder(v.get(v.size() - 2));
            for (int i = 0; i < v.size() - 2; i++) {
                email.append(v.get(i).charAt(0));
            }
            email.append(mail);
            System.out.println(email.toString());

            String ns = v.get(v.size() - 1);
            String[] dateParts = ns.split("/");
            for (String w : dateParts) {
                System.out.print(Integer.parseInt(w));
            }
            System.out.println();
        }
    }
}
