package core.module04;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD : return 100;
            case EUR : return 150;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD : return 10000;
            case EUR : return 5000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate(){
        switch (getCurrency()) {
            case USD : return 1;
            case EUR : return 0;
        }
        return 0;
    }

    @Override
    public int getCommission(int summ){
        switch (getCurrency()) {
            case USD : return summ < 1000 ? 3 : 5;
            case EUR : return summ < 1000 ? 10 : 11;
        }
        return 0;
    }
}
