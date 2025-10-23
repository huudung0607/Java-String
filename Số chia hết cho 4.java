import java.util.Scanner;

public class Main {
    static boolean check(String s) {
        if (s.length() < 2 && (s.charAt(0) - '0') % 4 == 0) {
            return true;
        }
        if (s.length() > 1) {
            int num1 = s.charAt(s.length() - 1) - '0';
            int num2 = s.charAt(s.length() - 2) - '0';
            int sum = num2 * 10 + num1;
            if (sum % 4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (check(s)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        scanner.close();
    }
}
