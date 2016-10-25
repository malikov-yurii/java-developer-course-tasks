package testpackage;

import java.util.Arrays;

public class tezd {
    public static void main(String[] args) {
        for (String s : System.getProperty("java.class.path").split(";"))
            System.out.println(s);
    }
}
