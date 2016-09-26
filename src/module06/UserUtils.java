package module06;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        return Arrays.stream(users)
                .distinct()
                .toArray(User[]::new);
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        return Arrays.stream(users)
                .filter(user -> {
                    if (user == null) return false;
                    if (user.getBalance() == balance)
                        return true;
                    else return false;
                })
                .toArray(User[]::new);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        return Arrays.stream(users)
                .filter(Objects::nonNull)
                .peek(user -> user.setSalary(user.getBalance() + user.getSalary()))
                .toArray(User[]::new);
    }

    public static final long[] getUsersId(User[] users) {
        return Arrays.stream(users)
                .filter(Objects::nonNull)
                .mapToLong(User::getId)
                .toArray();
    }

    public static User[] deleteEmptyUsers(User[] users) {
        return Arrays.stream(users)
                .filter(Objects::nonNull)
                .toArray(User[]::new);
    }
}
