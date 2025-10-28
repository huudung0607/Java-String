import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s =sc.nextLine();
            Map<Character,Integer> mp = new HashMap<>();
            int dem = 0;
            for(int i =0; i < s.length();i++){
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0) + 1);
            }
            for(var x : mp.entrySet()){
                dem += x.getValue() % 2;
            }
            if(dem <= 1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
