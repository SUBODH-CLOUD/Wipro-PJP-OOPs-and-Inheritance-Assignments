import java.util.Scanner;

public class WithoutFirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String string = sc.nextLine();
        char buf[] = new char[string.length()-2];
        string.getChars(1,string.length()-1, buf, 0);
        String string2 = new String(buf);
        System.out.println(string2);
    }
}
