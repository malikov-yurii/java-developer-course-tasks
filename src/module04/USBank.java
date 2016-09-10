package module04;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD : return 1000;
            case EUR : return 1200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD : return Integer.MAX_VALUE;
            case EUR : return 10000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate(){
        switch (getCurrency()) {
            case USD : return 1;
            case EUR : return 2;
        }
        return 0;
    }

    @Override
    public int getCommission(int summ){
        switch (getCurrency()) {
            case USD : return summ < 1000 ? 5 : 7;
            case EUR : return summ < 1000 ? 6 : 8;
        }
        return 0;
    }
}
