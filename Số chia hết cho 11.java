import java.util.Scanner;

public class Main {
    static boolean check(String s) {
        if (s.length() < 2 && s.charAt(0) == '0') {
            return true;
        }
        long sumchan = 0;
        long sumle = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sumle += s.charAt(i) - '0';
            } else {
                sumchan += s.charAt(i) - '0';
            }
        }
        if (Math.abs(sumchan - sumle) % 11 == 0 || Math.abs(sumle - sumchan) % 11 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (check(s)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        sc.close();
    }
}

