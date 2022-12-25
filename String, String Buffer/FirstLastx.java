public class FirstLastx {
    public static void main(String[] args) {
        String string = "xHix";
        char ch1 =string.charAt(0);
        char ch2 =string.charAt(string.length()-1);
        if(ch1==ch2){
            char buf[] = new char[string.length()-2];
            string.getChars(1, string.length()-1, buf, 0);
            System.out.println(buf);
        }else{
            System.out.println(string);
        }
    }
}
