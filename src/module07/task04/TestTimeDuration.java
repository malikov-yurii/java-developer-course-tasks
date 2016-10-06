package module07.task04;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestTimeDuration {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        LinkedList<String> stringLinkedList= new LinkedList<>();

//      1000 add()

        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.add(i+10000);
        }
        System.out.println("ArrayList<Integer> 1000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.add(i+20000);
        }
        System.out.println("LinkedList<Integer> 1000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.add(i + "1000A");
        }
        System.out.println("ArrayList<String> 1000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.add(i + "1000L");
        }
        System.out.println("LinkedList<String> 1000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

//      1000 set()

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.set(i,10000-i);
        }
        System.out.println("ArrayList<Integer> 1000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.set(i,20000-i);
        }
        System.out.println("LinkedList<Integer> 1000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.set(i, "ASET" + i);
        }
        System.out.println("ArrayList<String> 1000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.set(i, "LSET" + i);
        }
        System.out.println("LinkedList<String> 1000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

//      1000 get()

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.get(i);
        }
        System.out.println("ArrayList<Integer> 1000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.get(i);
        }
        System.out.println("LinkedList<Integer> 1000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.get(i);
        }
        System.out.println("ArrayList<String> 1000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.get(i);
        }
        System.out.println("LinkedList<String> 1000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

//      1000 remove()

        startTime = LocalTime.now();
        for (int i = 999; i  >= 0; i--) {
            integerArrayList.remove(i);
        }
        System.out.println("ArrayList<Integer> 1000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 999; i  >= 0; i--) {
            integerLinkedList.remove(i);
        }
        System.out.println("LinkedList<Integer> 1000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 999; i  >= 0; i--) {
            stringArrayList.remove(i);
        }
        System.out.println("ArrayList<String> 1000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 999; i  >= 0; i--) {
            stringLinkedList.remove(i);
        }
        System.out.println("LinkedList<String> 1000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');


//      100 000 add()

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            integerArrayList.add(i+50000);
        }
        System.out.println("ArrayList<Integer> 100000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            integerLinkedList.add(i+60000);
        }
        System.out.println("LinkedList<Integer> 100000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            stringArrayList.add(i + "ABIG");
        }
        System.out.println("ArrayList<String> 100000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            stringLinkedList.add("LBIG" + i);
        }
        System.out.println("LinkedList<String> 100000 add() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

//      100 000 set()

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            integerArrayList.set(i,i-10);
        }
        System.out.println("ArrayList<Integer> 100000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            integerLinkedList.set(i,i-11);
        }
        System.out.println("LinkedList<Integer> 100000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            stringArrayList.set(i, "AsetBig" + i);
        }
        System.out.println("ArrayList<String> 100000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            stringLinkedList.set(i,  i + "Lbigset");
        }
        System.out.println("LinkedList<String> 100000 set() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

//      100 000 get()

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            integerArrayList.get(i);
        }
        System.out.println("ArrayList<Integer> 100000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            integerLinkedList.get(i);
        }
        System.out.println("LinkedList<Integer> 100000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            stringArrayList.get(i);
        }
        System.out.println("ArrayList<String> 100000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            stringLinkedList.get(i);
        }
        System.out.println("LinkedList<String> 100000 get() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

//      100 000 remove()

        startTime = LocalTime.now();
        for (int i = 99999; i  >= 0; i--) {
            integerArrayList.remove(i);
        }
        System.out.println("ArrayList<Integer> 100000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 99999; i  >= 0; i--) {
            integerLinkedList.remove(i);
        }
        System.out.println("LinkedList<Integer> 100000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');

        startTime = LocalTime.now();
        for (int i = 99999; i  >= 0; i--) {
            stringArrayList.remove(i);
        }
        System.out.println("ArrayList<String> 100000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()));

        startTime = LocalTime.now();
        for (int i = 99999; i  >= 0; i--) {
            stringLinkedList.remove(i);
        }
        System.out.println("LinkedList<String> 100000 remove() operations time = " + (LocalTime.now().getNano() - startTime.getNano()) + '\n');
    }
}
