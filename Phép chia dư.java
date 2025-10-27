import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        long res = 0;
        for(int i = 0 ;i < s.length();i++){
            res = (res * 10) % k + (s.charAt(i) -'0') % k;
            res %= k;
        }
        System.out.print(res);
    }
}
