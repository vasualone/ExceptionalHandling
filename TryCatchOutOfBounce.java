package ExceptionalHandling;



public class TryCatchOutOfBounce {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 5};
        try {
            array[10] = 6;

            for (int i = 0; i < array.length; i++) {


                System.out.println(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException tc){
            System.out.println("Index value out of range");
        }finally {
            System.out.println("i am always executable");
        }
    }
}