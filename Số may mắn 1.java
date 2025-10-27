import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int sum(String s){
        int res = 0;
        for(int i = 0;i < s.length();i++){
            res += s.charAt(i) -'0';
        }
        return res;
    }
    public static boolean check(String s){
        int n = sum(s);
        while(n > 9){
            n = sum(Integer.toString(n));
        }
        return n == 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.print("YES");
        else System.out.print("NO");
    }
}
