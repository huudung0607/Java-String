import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        for(int i = 0; i < s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
