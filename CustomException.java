package ExceptionalHandling;

import com.sun.jdi.connect.VMStartException;

public class CustomException {
    public static void main(String[] args) {
int x=14;
try {


    if (x >= 18) {
        throw new VasuException("you are eligible for vote");
    } else
        throw new VasuException("you are not eligible for vote");
}catch (VasuException ve){
    System.out.println(ve.getMessage());
}


    }}