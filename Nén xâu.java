import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s += "#";
        int dem = 1;
        char c = s.charAt(0);
        for(int i = 1;i < s.length();i++){
            if(c == s.charAt(i)){
                dem++;
            }
            else{
                System.out.print(c + "" + dem);
                c = s.charAt(i);
                dem = 1;
            }
        }
    }
}
