package core.module10;

public class CustomExceptionTask02 extends Exception {

    public CustomExceptionTask02(String message) {super(message);}

    public void printMessage(){System.out.println(getMessage());}

    public static void main(String[] args) {
        try {
            throw new CustomExceptionTask02("Message from the exception");
        } catch (CustomExceptionTask02 e){
            e.printMessage();
        }
    }
}
