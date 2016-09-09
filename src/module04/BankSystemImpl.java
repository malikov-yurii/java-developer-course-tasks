package module04;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        double withdrawal = amount * (1 + user.getBank().getCommision(amount) / 100);
        if ((amount < user.getBank().getLimitOfWithdrawal()) && (user.getBalance() >= withdrawal))
            user.setBalance(user.getBalance() - withdrawal);
        else
            System.out.println("Withdrawal operation failed.");
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount < user.getBank().getLimitOfFunding())
            user.setBalance(user.getBalance() + amount);
        else
            System.out.println("Funding operation failed.");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double fromUserBalance = fromUser.getBalance();
        double toUserBalance = toUser.getBalance();
        if (fromUserBalance >= amount)
            try {
                fromUser.setBalance(fromUserBalance - amount);
                toUser.setBalance(toUserBalance + amount);
                return;
            } catch (Throwable t) {
                fromUser.setBalance(fromUserBalance);
                toUser.setBalance(toUserBalance);
            }
        System.out.println("Transfer operation failed.");
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
