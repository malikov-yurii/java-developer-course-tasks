package core.module04;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    public int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD : return 2000;
            case EUR : return 2200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD : return 10000;
            case EUR : return 20000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate(){
        switch (getCurrency()) {
            case USD : return 0;
            case EUR : return 1;
        }
        return 0;
    }

    @Override
    public int getCommission(int summ){
        switch (getCurrency()) {
            case USD : return summ < 1000 ? 5 : 7;
            case EUR : return summ < 1000 ? 2 : 4;
        }
        return 0;
    }
}
