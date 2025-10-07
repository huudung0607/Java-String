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
        String ns = sc.nextLine();
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
        System.out.println(ten);
        String[] ngaySinh = ns.split("/");
        if(ngaySinh[0].length() == 1){
            ngaySinh[0] = "0" + ngaySinh[0];
        }
        if(ngaySinh[1].length() == 1){
            ngaySinh[1] = "0" + ngaySinh[1];
        }
        ns = ngaySinh[0] + "/" + ngaySinh[1] + "/" + ngaySinh[2];
        System.out.println(ns);
    }
}
