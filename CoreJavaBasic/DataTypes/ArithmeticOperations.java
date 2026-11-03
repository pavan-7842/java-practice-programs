package Com.globalQuest.CoreJavaBasic.DataTypes;

public class ArithmeticOperations {
     static double add(double a, double b) {
        return a+b;
    }
     static double sub(double a, double b) {
        return a-b;
    }
    static double mul(double a, double b) {
        return a*b;
    }
    static double mod(double a, double b) {
        return a%b;
    }
    static double div(double a, double b) {
    	   return a/b;
    }
    public static void main(String[] args) {
//        ArithmeticOperations ar = new ArithmeticOperations();
//        System.out.println("Addition = "+ar.add(10.0,10.0));
//        System.out.println("Subtraction ="+ar.sub(20.5,10.0));
//        System.out.println("Multiplication ="+ar.mul(20.5,10.0));
//        System.out.println("Division ="+ar.div(20.5,10.0));
//        System.out.println("Modulus = "+ar.mod(20.5,10.0));
    	      System.out.println(add(20.5,10.0));
    	      System.out.println(sub(20.5,10.0));
    	      System.out.println(mul(20.5,10.0));
    	      System.out.println(div(20.5,10.0));
    	      System.out.println(mod(20.5,10.0));
    }
}
