import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String python = "python";
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == python.charAt(cnt)){
                cnt++;
            }
            if(cnt == 6){
                System.out.print("YES");return;
            }
        }
        System.out.print("NO");
    }
}
