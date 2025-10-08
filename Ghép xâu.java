import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(sc.nextLine());
        Vector<String> v = new Vector<>();
        for(int i = 0;i < n;i++){
            String s = sc.next();
            v.add(s);
        }
        String res ="";
        Collections.sort(v, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        for(var x : v){
            res += x;
        }
        System.out.print(res);
    }
}
