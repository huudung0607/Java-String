import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String s = sc.nextLine();
        s = s.replaceAll("[a-zA-Z]"," ");
        String []a = s.trim().split("\\s+");
        for(int i = 0;i < a.length;i++){
            while(a[i].length() > 1 && a[i].charAt(0) == '0'){
                a[i] = a[i].substring(1);
            }
        }
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        for(var x : a){
            System.out.print(x);
        }
    }
}
