import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(String s){
        int l = 0,r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = sc.nextLine();
        String[] a = s.split("\\s+");
        LinkedHashSet<String> se = new LinkedHashSet<>();
        for(int i = 0; i < a.length;i++){
            if(check(a[i])){
                se.add(a[i]);
            }
        }
        List<String> list = new ArrayList<>(se);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for(var c : list){
            System.out.print(c + " ");
        }
    }
}
