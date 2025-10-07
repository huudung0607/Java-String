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
        TreeMap<String,Integer> mp = new TreeMap<>();
        for(int i = 0; i < a.length;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0) + 1);
        }
        int maxVal = -1;
        String maxString = "";
        for(var x : mp.entrySet()){
            if(x.getValue() > maxVal || x.getValue() == maxVal && x.getKey().compareTo(maxString) > 0){
                maxVal = x.getValue();
                maxString = x.getKey();
            }
        }
        System.out.println(maxString + " " + maxVal);
        int minVal = Integer.MAX_VALUE;
        String minString ="";
        for(var x : mp.entrySet()){
            if(x.getValue() < minVal || x.getValue() == minVal && x.getKey().compareTo(minString) > 0){
                minString = x.getKey();
                minVal = x.getValue();
            }
        }
        System.out.print(minString + " " + minVal);
    }
}
