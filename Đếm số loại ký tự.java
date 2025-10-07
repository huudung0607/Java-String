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
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for(int i = 0;i < s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                cnt1++;
            } else if (Character.isDigit(s.charAt(i))) {
                cnt2++;
            }
            else cnt3++;
        }
        System.out.print(cnt1 + " " + cnt2 + " " + cnt3);
    }
}
