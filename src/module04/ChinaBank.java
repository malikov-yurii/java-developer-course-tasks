package module04;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (Currency.USD.equals(getCurrency()))
            return 100;
        if (Currency.EUR.equals(getCurrency()))
            return 150;
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (Currency.USD.equals(getCurrency()))
            return 10000;
        if (Currency.EUR.equals(getCurrency()))
            return 5000;
        return 0;
    }

    @Override
    public int getMonthlyRate(){
        if (Currency.USD.equals(getCurrency()))
            return 1;
        if (Currency.EUR.equals(getCurrency()))
            return 0;
        return 0;
    }

    @Override
    public int getCommision(int summ){
        if (Currency.USD.equals(getCurrency()))
            if (summ < 1000)
                return 3;
            else
                return 5;
        if (Currency.EUR.equals(getCurrency()))
            if (summ < 1000)
                return 10;
            else
                return 11;
        return 0;
    }
}
