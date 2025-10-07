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
        String s = sc.next();
        String a = sc.next();
        Set<Character> se1 = new TreeSet<>();
        Set<Character> se2 = new TreeSet<>();
        for(int i = 0; i < s.length();i++){
            se1.add(s.charAt(i));
        }
        for(int i = 0; i < a.length();i++){
            se2.add(a.charAt(i));
        }
        for(char c : se1){
            if(!se2.contains(c)){
                System.out.print(c);
            }
        }
        System.out.println();
        for(char c : se2){
            if(!se1.contains(c)){
                System.out.print(c);
            }
        }
    }
}
