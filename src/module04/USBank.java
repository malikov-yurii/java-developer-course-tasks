package module04;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (Currency.USD.equals(getCurrency()))
            return 1000;
        if (Currency.EUR.equals(getCurrency()))
            return 1200;
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (Currency.USD.equals(getCurrency()))
            return Integer.MAX_VALUE;
        if (Currency.EUR.equals(getCurrency()))
            return 10000;
        return 0;
    }

    @Override
    public int getMonthlyRate(){
        if (Currency.USD.equals(getCurrency()))
            return 1;
        if (Currency.EUR.equals(getCurrency()))
            return 2;
        return 0;
    }

    @Override
    public int getCommision(int summ){
        if (Currency.USD.equals(getCurrency()))
            if (summ < 1000)
                return 5;
            else
                return 7;
        if (Currency.EUR.equals(getCurrency()))
            if (summ < 1000)
                return 6;
            else
                return 8;
        return 0;
    }
}
