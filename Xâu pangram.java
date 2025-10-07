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
        s = s.toLowerCase();
        Set<Character> se = new HashSet<>();
        for(int i =0;i < s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                se.add(s.charAt(i));
            }
        }
        if(se.size() == 26) System.out.print("YES");
        else System.out.print("NO");
    }
}
