package module04;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank(1234, "USA", Currency.USD, 12, 2000, 20, 2000000);
        ChinaBank chinaBank = new ChinaBank(4234, "China", Currency.USD, 42, 4000, 40, 4000000);
        EUBank euBank = new EUBank(6534, "Poland", Currency.EUR, 62, 6000, 60, 6000000);

        User[] users = new User[6];
        users[0] = new User(111, "Bob", 1111, 11, "IBM", 11111, usBank);
        users[1] = new User(222, "Rob", 2222, 22, "IBM", 22222, usBank);
        users[2] = new User(333, "Zack", 3322, 33, "BMW", 3332, euBank);
        users[3] = new User(444, "Dag", 4422, 44, "BMW", 4432, euBank);
        users[4] = new User(555, "Mao", 5522, 55, "Dao", 5532, chinaBank);
        users[5] = new User(666, "Pao", 6622, 55, "Dao", 6632, chinaBank);

        BankSystemImpl bankUtils = new BankSystemImpl();
        for (int i = 0; i < users.length; i++) {
            bankUtils.fundUser(users[i], 1000);
            bankUtils.withdrawOfUser(users[i], 10);
            bankUtils.paySalary(users[i]);
            if (i>0) bankUtils.transferMoney(users[i-1], users[i], 1);
            System.out.println(users[i]);
        }
    }
}
