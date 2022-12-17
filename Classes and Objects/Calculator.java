 class Calculator {
    static double powerDouble(int num1, int num2){
        double r2 = Math.pow(num1, num2);
        return r2;
    }
    static double powerInt(int num1, int num2){
       double r = powerDouble(num1, num2);
       return r;
    }
    public static void main(String[] args) {
       System.out.println( Calculator.powerInt(9, 2));
    }

}

