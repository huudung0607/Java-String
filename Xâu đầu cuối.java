import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String s = sc.nextLine();
        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0) + 1);
        }
        long cnt = 0;
        for(var x : mp.entrySet()){
            cnt = 1l * cnt + 1l * x.getValue() * (x.getValue() - 1)/2;
            cnt += x.getValue();
        }
        System.out.print(cnt);
    }
}
