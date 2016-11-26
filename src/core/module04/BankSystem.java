package core.module04;

public interface BankSystem {
    void withdrawOfUser(User user, int amount) throws Exception;
    void fundUser(User user, int amount) throws Exception;
    void transferMoney(User fromUser, User toUser, int amount) throws Exception;
    void paySalary(User user);
}
