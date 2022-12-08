package ExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingException {
    public static void main(String[] args)  {


        Scanner myReader = null;

try {
    File file = new File("jetbrains://idea/navigate/reference?project=Reverse&fqn=Reverse");

    myReader = new Scanner(file);


    while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
    }
    myReader.close();
}catch (FileNotFoundException fn){
    System.out.println("there is an exception");
}
finally {
    System.out.println("file path not found");
    {

    }
}
    }
}