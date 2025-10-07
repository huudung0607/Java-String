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
        TreeMap<Character,Integer> mp1 = new TreeMap<>();
        LinkedHashMap<Character,Integer> mp2 = new LinkedHashMap<>();
        for(int i = 0;i < s.length();i++){
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i),0) + 1);
            mp2.put(s.charAt(i), mp2.getOrDefault(s.charAt(i),0) + 1);
        }
        for(var x : mp1.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println();
        for(var x : mp2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
