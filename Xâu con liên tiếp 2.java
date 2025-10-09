import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        String maxstr = "";
        StringBuilder curstr = new StringBuilder();
        curstr.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                curstr.append(s.charAt(i));
            } else {
                if (curstr.length() > maxstr.length() ||
                    (curstr.length() == maxstr.length() && curstr.toString().compareTo(maxstr) > 0)) {
                    maxstr = curstr.toString();
                }
                curstr = new StringBuilder();
                curstr.append(s.charAt(i));
            }
        }

        if (curstr.length() > maxstr.length() ||
            (curstr.length() == maxstr.length() && curstr.toString().compareTo(maxstr) > 0)) {
            maxstr = curstr.toString();
        }

        System.out.print(maxstr);
    }
}

