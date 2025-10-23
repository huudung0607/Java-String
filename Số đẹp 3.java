import java.util.Scanner;

public class Main {
    static boolean khonggiam(String s) {
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) - '0') < (s.charAt(i - 1) - '0')) {
                return false;
            }
        }
        return true;
    }

    static boolean khongtang(String s) {
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) - '0') > (s.charAt(i - 1) - '0')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (khonggiam(s) || khongtang(s)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        scanner.close();
    }
}
