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
        TreeSet<String> se = new TreeSet<>();
        LinkedHashSet<String> se2 = new LinkedHashSet<>();
        for(int i = 0;i < a.length;i++){
            se.add(a[i]);
            se2.add(a[i]);
        }
        for(var i : se){
            System.out.print(i + " ");
        }
        System.out.println();
        for(var i : se2){
            System.out.print(i + " ");
        }
    }
}
