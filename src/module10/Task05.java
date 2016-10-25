package module10;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Random;

public class Task05 {
    public static void newMethod(int i) throws Exception{
        switch (i) {
            case 1: throw new FileAlreadyExistsException("My new type that extends FileAlreadyExistException") {};
            case 2: throw new FileNotFoundException("My new type that extends FileNotFoundException") {};
            case 3: throw new NullPointerException("My new type that extends NullPointerException") {};
        }
    }
    public static void main(String[] args){
        try{
            newMethod(new Random().nextInt(3) + 1);
        } catch (Throwable e){e.printStackTrace();}
    }
}
