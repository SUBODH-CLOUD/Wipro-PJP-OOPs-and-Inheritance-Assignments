import java.util.Scanner;

public class RemoveLRStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
       int Starindex = string.indexOf('*');
       StringBuffer sb = new StringBuffer(string);
       sb.delete(Starindex-1, Starindex+2);
       System.out.println(sb);
    }
}
