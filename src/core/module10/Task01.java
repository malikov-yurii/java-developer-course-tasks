package core.module10;

public class Task01 {
    public static void main(String[] args) {
        try{
            throw new Exception("My new Exception");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.err.println("I swear, I were here");
        }
    }
}
