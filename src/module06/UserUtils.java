package module06;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        return (User[]) Arrays.asList(users)
                .stream()
                .distinct()
                .collect(Collectors.toList())
                .toArray();
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        return (User[]) Arrays.asList(users)
                .stream()
                .filter(user -> user.getBalance() == balance)
                .collect(Collectors.toList())
                .toArray();
    }

    public static final User[] paySalaryToUsers(User[] users) {
        return (User[]) Arrays.asList(users)
                .stream()
                .map(user -> {
                    user.setBalance(user.getBalance() + user.getSalary());
                    return user;
                })
                .collect(Collectors.toList())
                .toArray();
    }

    public static final long[] getUsersId(User[] users) {
        return Arrays.asList(users)
                .stream()
                .mapToLong(User::getId)
                .toArray();
    }

    public static User[] deleteEmptyUsers(User[] users) {
        return (User[]) Arrays.asList(users)
                .stream()
                .filter(user -> user == null)
                .collect(Collectors.toList())
                .toArray();
    }


}
