package testpackage;

import java.util.Arrays;

import static testpackage.TestClass.changeArray;


public class TestClass {

    String i;

    @Override
    public String toString() {
        return "i= " + this.i;
    }

    public TestClass(int i) {
        this.i = i + "";
    }

    public static void main(String[] args) {
        System.out.println(1 % 4);

        TestClass testClass = new TestClass(1);
        TestClass.changeArray(testClass);
        System.out.println(testClass);
    }

    public static void changeArray(TestClass testClass){
        testClass.i = "1278634+++++";
    }
}
