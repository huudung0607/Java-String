import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long sum = 0;
        long lt = 1;
        for(int i = s.length() - 1;i >= 0;i--){
            sum += (s.charAt(i) - '0') % 5 * lt;
            sum %= 5;
            lt *= 2;
            lt %= 5;
        }
        if(sum == 0) System.out.print("YES");
        else System.out.print("NO");
    }
}
