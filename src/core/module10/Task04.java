package core.module10;

public class Task04 extends Exception {
    public static void main(String[] args) throws Task04{
        f();
    }

    public static void f() throws Task04 {
        try {
            g();
        } catch (Task04 e) {
            throw new RuntimeException("My Runtime Exception"){};
        }
    }

    public static void g() throws Task04 {
        throw new Task04();
    }

}
