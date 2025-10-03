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
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < t;i++){
            String s = sc.nextLine();
            int sum = 0;
            for(int j = 0; j < s.length() - 1;j++){
                if(mp.get(s.charAt(j)) < mp.get(s.charAt(j + 1))){
                    sum -= mp.get(s.charAt(j));
                }
                else sum += mp.get(s.charAt(j));
            }
            sum += mp.get(s.charAt(s.length() - 1));
            System.out.println(sum);
        }
    }
}
