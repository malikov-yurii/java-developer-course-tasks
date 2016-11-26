package core.module06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User(1, "Rob", "Dougan", 1111, 12345),
                new User(2, "Bob", "Dougan", 2222, 12345),
                null,
                new User(3, "Rob", "Dougan", 3323, 34456)
        };

        System.out.println("Now we'll test methods with User[] :\n" + Arrays.toString(users));
//        System.out.println("uniqueUsers(User[] users) :\n" + Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println("usersWithContitionalBalance(User[] users, int balance) :\n" + Arrays.toString(UserUtils.usersWithConditionalBalance(users, 12345)));
        System.out.println("paySalaryToUsers(User[] users) :\n" + Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println("getUsersId(User[] users) :\n" + Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println("deleteEmptyUsers(User[] users) :\n" + Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
