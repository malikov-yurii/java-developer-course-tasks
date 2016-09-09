package module04;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (Currency.USD.equals(getCurrency()))
            return 2000;
        if (Currency.EUR.equals(getCurrency()))
            return 2200;
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (Currency.USD.equals(getCurrency()))
            return 10000;
        if (Currency.EUR.equals(getCurrency()))
            return 20000;
        return 0;
    }

    @Override
    public int getMonthlyRate(){
        if (Currency.USD.equals(getCurrency()))
            return 0;
        if (Currency.EUR.equals(getCurrency()))
            return 1;
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
                return 2;
            else
                return 4;
        return 0;
    }
}
