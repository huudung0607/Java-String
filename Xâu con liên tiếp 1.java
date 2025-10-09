import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String s = sc.nextLine();
        long cnt = 0;
        long maxCnt = Long.MIN_VALUE;
        char maxChar = '@';
        s = s + "0";
        for(int i = 1; i < s.length();i++){
            cnt++;
            if(s.charAt(i) != s.charAt(i - 1)){
                if(cnt > maxCnt || cnt == maxCnt && s.charAt(i - 1) > maxChar){
                    maxChar = s.charAt(i - 1);
                    maxCnt = cnt;
                    cnt = 0;
                }
                else cnt = 0;
            }
        }
        for(int i = 0;i < maxCnt;i++){
            System.out.print(maxChar);
        }
    }
}
