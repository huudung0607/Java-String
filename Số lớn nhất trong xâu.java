import java.util.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String s = sc.nextLine();
        s = s.replaceAll("[a-zA-Z]"," ");
        String []num = s.trim().split("\\s+");
        for(int i = 0 ;i < num.length;i++){
            while(num[i].length() > 1 && num[i].charAt(0) == '0'){
                num[i] = num[i].substring(1);
            }
        }
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        System.out.print(num[num.length - 1]);
    }
}
