import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;

public class Main {
    public static boolean thuanNghich(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean chua6(String s){
        int cnt = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '6'){
                cnt++;
            }
            if(cnt >= 1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(thuanNghich(s) && chua6(s)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
