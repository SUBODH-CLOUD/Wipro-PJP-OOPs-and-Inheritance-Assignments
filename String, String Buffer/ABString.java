public class ABString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        
       StringBuffer sb = new StringBuffer();
       for(int i =0; i< a.length(); i++){
        sb.append(a.charAt(i)).append(b.charAt(i));
       }
       System.out.println(sb);
     }
   }


