public class HalfString {
    public static void main(String[] args) {
        String string = "TomCa";
        if(string.length()%2==0){
            for(int i =0; i<string.length()/2; i++){
                System.out.print(string.charAt(i));
            }
        }else{
            System.out.println("null");
        }
    }
}
