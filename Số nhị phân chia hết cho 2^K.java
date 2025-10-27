import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        for(int i = s.length() - 1;i >= s.length() - k;i--){
            if (s.charAt(i) == '1'){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
