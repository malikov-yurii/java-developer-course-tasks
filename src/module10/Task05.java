package module10;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Random;

public class Task05 {
    public static void newMethod(int i) throws FileAlreadyExistsException, FileNotFoundException, NullPointerException{
        switch (i) {
            case 1: throw new FileAlreadyExistsException("My new type that extends FileAlreadyExistException") {};
            case 2: throw new FileNotFoundException("My new type that extends FileNotFoundException") {};
            case 3: throw new NullPointerException("My new type that extends NullPointerException") {};
        }
    }
    public static void main(String[] args){
        try{
            newMethod(new Random().nextInt(3) + 1);
        }
        catch (FileAlreadyExistsException e){System.out.println("File already exists exeption: " + e.getMessage());}
        catch (FileNotFoundException e){System.out.println("File not found exeption: " + e.getMessage());}
        catch (NullPointerException e){System.out.println("Null pointer exeption: " + e.getMessage());}

    }
}
