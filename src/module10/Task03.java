package module10;

public class Task03 {
    public static void main(String[] args) {
        Object object = null;
        try {
            object.toString();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
