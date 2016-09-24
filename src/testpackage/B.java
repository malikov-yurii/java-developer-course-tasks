package testpackage;

public class B extends A {


    public static void m1(){
        System.out.println("from B");
    }

    public static void main(String[] args) {
        A.m1();
        A.m1();
    }
}
