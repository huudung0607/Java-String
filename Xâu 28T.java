import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<String,Integer> mp = new HashMap<>();
        mp.put("0,0",1);
        int ans = 0,dem2 = 0,dem8 = 0,demt = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '2') dem2++;
            if(s.charAt(i) == '8') dem8++;
            if(s.charAt(i) == 't') demt++;
            String tmp = (dem2 - dem8) + "," + (dem2 - demt);
            ans += mp.getOrDefault(tmp,0);
            mp.put(tmp, mp.getOrDefault(tmp,0) + 1);
        }
        System.out.print(ans);
    }
}
