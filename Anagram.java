import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static boolean check(String a,String b){
        char []A = a.toCharArray();
        char []B = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A,B);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            if(check(a,b)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
