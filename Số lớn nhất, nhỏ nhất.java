import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();

        if (m == 1 && s == 0) {
            System.out.println(0);
            System.out.println(0);
            return;
        }
        if (s > 9 * m) {
            System.out.println("NOT FOUND");
            return;
        }

        StringBuilder min = new StringBuilder();
        StringBuilder max = new StringBuilder();
        int num = s;

        for (int i = 0; i < m; i++) {
            if (num >= 9) {
                max.append('9');
                num -= 9;
            } else {
                max.append(num);
                num = 0;
            }
        }

        num = s - 1;
        for (int i = 0; i < m - 1; i++) {
            if (num >= 9) {
                min.append('9');
                num -= 9;
            } else {
                min.append(num);
                num = 0;
            }
        }
        min.append('1');
        min.reverse();

        System.out.println(min.toString());
        System.out.println(max.toString());
    }
}
