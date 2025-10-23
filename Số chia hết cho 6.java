import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;

public class Main {
    public static boolean checksum(String s)
    {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        if (sum % 3 == 0) {
            return true;
        }
        return false;
    }
    public static boolean check2(String s)
    {
        if ((s.charAt(s.length() - 1) - '0') % 2 == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check2(s) && checksum(s)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
