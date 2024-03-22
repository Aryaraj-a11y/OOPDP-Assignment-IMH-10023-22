
package lab9;
import java.util.*;
public class Lab9ques6 {
    static String removeZero(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(0, i, "");
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        String s1 = removeZero(str); 
        System.out.println(s1);
}
}