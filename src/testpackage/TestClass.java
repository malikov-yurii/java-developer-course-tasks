package testpackage;




public class TestClass implements InterfaceFirst{



    public static void main(String[] args) {

        try {
            System.out.println("1");
            System.out.println("2");
//        System.out.println(new Object());
            throw  new Exception();
        } catch (Exception e){
            System.out.println("Exception");
        }

    }


    @Override
    public void firstMethod() {

    }
}
