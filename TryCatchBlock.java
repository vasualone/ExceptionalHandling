package ExceptionalHandling;

public class TryCatchBlock {
    public static void main(String[] args) {

        try{
            int a=4;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException ae){
            System.out.println("any number divisible by zero is not possible");
        }
        finally {
            System.out.println("infinity");
        }
        System.out.println("remaining code will be executed");
    }

}
