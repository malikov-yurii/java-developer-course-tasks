package core.module03.task04;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    //  if there is not enough money, Exception is thrown
    public void withdraw(int summ) throws Exception {
        if (this.getBalance() >= summ)
            this.setBalance(this.getBalance() - (int) (summ < 1000 ? summ * 1.05 : summ * 1.1));
        else
            throw new Exception("Not enough money on balance to execute withdraw operation.");
    }

    public void paySalary() {
        this.setBalance(this.getBalance() + this.getSalary());
    }

    public int companyNameLength() {
        return companyName != null ? companyName.length() : 0;
    }

    public void monthIncreaser(int addMonth) {
        this.setMonthsOfEmployment(this.getMonthsOfEmployment() + addMonth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
