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
        LinkedHashSet<String> se2 = new LinkedHashSet<>();
        for(var x : arrT) {
            se.add(x);
        }
        Arrays.sort(arrS);
        for(var x : arrS){
            se2.add(x);
        }
        for(var x : se2){
            if(!se.contains(x)){
                System.out.print(x + " ");
                se.remove(x);
            }
        }
    }
}
