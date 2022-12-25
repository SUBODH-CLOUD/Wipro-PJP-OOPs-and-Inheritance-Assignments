class Palimdrome {
    public static void main(String[] args) {
        String s = "abc";
        char[] ch;
        ch = s.toCharArray();

        char[] reversech = new char[ch.length];

        int j = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            reversech[j] = ch[i];
            j++;
        }

        String s2 = new String(reversech);

        if (s.equals(s2)) {
            System.out.println(s + " is a palimdrome String");
        } else {
            System.out.println(s + " is not a palimdrome string.");
        }
    }
}
