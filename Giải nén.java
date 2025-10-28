import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("([a-z])([0-9]+)");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            char c = matcher.group(1).charAt(0);
            int cnt = Integer.parseInt(matcher.group(2));
            for(int i =1;i <= cnt;i++){
                System.out.print(c);
            }
        }
    }
}
