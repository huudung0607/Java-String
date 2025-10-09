import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String s = sc.nextLine();
        s = s.replaceAll("[a-zA-Z]"," ");
        String []num = s.trim().split("\\s+");
        long sum = 0;
        for(int i = 0; i < num.length;i++){
            sum += Long.parseLong(num[i]);
        }
        System.out.print(sum);
    }
}
