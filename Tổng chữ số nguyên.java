import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long sum = 0;
        for(int i = 0;i < s.length();i++){
            sum += s.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}
