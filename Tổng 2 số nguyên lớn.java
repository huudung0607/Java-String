import java.util.Scanner;

public class Main {
    public static String sum(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        int A = a.length(), B = b.length();
        for (int i = 0; i < A; i++) {
            int soA = a.charAt(A - i - 1) - '0';
            int soB = (i < B) ? b.charAt(B - i - 1) - '0' : 0;
            int sum = soA + soB + cnt;
            cnt = sum / 10;
            res.append(sum % 10);
        }
        if (cnt != 0) {
            res.append(cnt);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(sum(a, b));
        }
        sc.close();
    }
}
