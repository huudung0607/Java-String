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
        String[] b = a;
        Arrays.sort(a);
        for(var c : a){
            System.out.print(c + " ");
        }
        System.out.println();
        Arrays.sort(b, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        for(var c : b){
            System.out.print(c + " ");
        }
    }
}
