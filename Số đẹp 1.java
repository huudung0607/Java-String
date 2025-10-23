import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;

public class Main {
    public static boolean checkPrime(long n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean checkSum(String s){
        for(int i = 0;i < s.length();i++){
            long a = s.charAt(i) - '0';
            if(!checkPrime(a)){
                return false;
            }
        }
        return true;
    }
    public static boolean check(String s){
        long sum = 0;
        for(int i = 0;i < s.length();i++){
            sum += s.charAt(i) - '0';
        }
        if(checkPrime(sum)) return true;
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s) && checkSum(s)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
