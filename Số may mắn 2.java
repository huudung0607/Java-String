import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        for(int i = 0;i < s.length() - 2;i++){
            if(s.length() < 2){
                break;
            }
            if(s.charAt(i) == '1' && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '1'){
                s.delete(i,i + 3);
                i--;
            }
        }
        if(s.length() == 0) System.out.print("EMPTY");
        else System.out.print(s);
    }
}
