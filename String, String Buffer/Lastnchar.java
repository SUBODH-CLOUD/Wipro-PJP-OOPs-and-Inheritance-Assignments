public class Lastnchar {
    public static void main(String[] args) {
        String string = "Wipro";
        int i =6;
        char buf[] = new char[i];
        int start = string.length()-i;
        string.getChars(start,string.length(), buf, 0);
        for(int j=0; j<i; j++){

        
        System.out.print(buf);
    }
}
}
