import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String s = sc.nextLine();
        String t = sc.nextLine();
        String []arrS = s.trim().toLowerCase().split("\\s+");
        String []arrT = t.trim().toLowerCase().split("\\s+");
        Set<String> se = new HashSet<>();
        for(var x : arrS) {
            se.add(x);
        }
        Arrays.sort(arrT);
        for(var x : arrT){
            if(se.contains(x)){
                System.out.print(x + " ");
                se.remove(x);
            }
        }
    }
}
