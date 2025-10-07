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
        String ten = sc.nextLine();
        String []hoTen = ten.trim().toLowerCase().split("\\s+");
        String res="";
        for(String tmp : hoTen){
            res += Character.toUpperCase(tmp.charAt(0));
            for(int j = 1; j < tmp.length();j++){
                res += Character.toLowerCase(tmp.charAt(j));
            }
            res += " ";
        }
        ten = res.trim();
        var cachThua = ten.lastIndexOf(" ");
        String name = ten.substring(cachThua + 1);
        name = name.toUpperCase();
        name.trim();
        String ho = res.substring(0,cachThua);
        System.out.println(ho + ", " + name);
        System.out.print(name + ", " + ho);
    }
}
