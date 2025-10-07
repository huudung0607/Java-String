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
        String[] a = s.split("\\s+");
        TreeMap<String,Integer> mp1 = new TreeMap<>();
        LinkedHashMap<String,Integer> mp2 = new LinkedHashMap<>();
        for(int i = 0; i < a.length;i++){
            mp1.put(a[i],mp1.getOrDefault(a[i],0) + 1);
            mp2.put(a[i],mp2.getOrDefault(a[i],0) + 1);
        }
        for(var i : mp1.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        System.out.println();
        for(var i : mp2.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
