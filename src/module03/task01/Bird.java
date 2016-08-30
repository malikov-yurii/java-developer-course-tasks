package module03.task01;

public class Bird extends Animal {
    void sing() {System.out.println("I am singing");}

    void fly() {System.out.println("I am flying");}

    Bird(){
        this.walk();
        this.fly();
        this.sing();
        System.out.println("I am Bird");
    }
}