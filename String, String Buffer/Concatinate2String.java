public class Concatinate2String {
    public static void main(String[] args) {
        String string1 = "Mark";
        String string2 = "kate";

        char ch1 = string1.charAt(string1.length() - 1);
        char ch2 = string2.charAt(0);

        if (ch1 == ch2) {
            char buf[] = new char[string2.length() - 1];
            int end = string2.length();

            string2.getChars(1, end, buf, 0);
            String string3 = new String(buf);

            System.out.println(string1.toLowerCase() + string3.toLowerCase());
        } else {
            System.out.println(string1.toLowerCase() + " " + string2.toLowerCase());
        }
    }
}
