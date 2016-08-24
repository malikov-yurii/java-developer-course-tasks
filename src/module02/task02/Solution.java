package module02.task02;

public class Solution {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    //HOMEWORK 2.1

    // It can remove unnecessary zeros in the end of double
    public static String getNiceStringFromDouble(double d) {
        int i = (int) d;
        return i == d ? String.valueOf(i) : String.valueOf(d);
    }

    static double withdrawBalance(double balance, double withdrawal) {
        return balance - withdrawal * 1.05;
    }

    //HOMEWORK 2.2

    // method returns -1 if fails
    static double withdrawBalance(String ownerName, double withdrawal) {
        for (int i = 0; i < ownerNames.length; i++)
            if (ownerName.equals(ownerNames[i]))
                return withdrawBalance(balances[i], withdrawal);
        return -1;
    }

    //HOMEWORK 2.3

    // method returns -1 if fails
    static double fundBalance(String ownerName, double fund) {
        for (int i = 0; i < ownerNames.length; i++)
            if (ownerName.equals(ownerNames[i]))
                return balances[i] + fund;
        return -1;
    }

    public static void main(String[] args) {

//      Testing 2.1

        double withdrawalResult = withdrawBalance(100, 10);
        if (withdrawalResult < 0)
            System.out.println("NO");
        else
            System.out.println("OK " + getNiceStringFromDouble(10 * 0.05) + " " +
                    getNiceStringFromDouble(withdrawalResult));

        withdrawalResult = withdrawBalance(100, 99);
        if (withdrawalResult < 0)
            System.out.println("NO");
        else
            System.out.println("OK " + getNiceStringFromDouble(99 * 0.05) + " " +
                    getNiceStringFromDouble(withdrawalResult));

//      Testing 2.2

        withdrawalResult = withdrawBalance("Ann", 100);
        if (withdrawalResult != -1)
            if (withdrawalResult < 0)
                System.out.println("NO Ann");
            else
                System.out.println("Ann 100 " + getNiceStringFromDouble(withdrawalResult));

        withdrawalResult = withdrawBalance("Oww", 490);
        if (withdrawalResult != -1)
            if (withdrawalResult < 0)
                System.out.println("NO Oww");
            else
                System.out.println("Oww 490" + getNiceStringFromDouble(withdrawalResult));

//      Testing 2.3

        System.out.println("Oww " + ((!("-1".equals(getNiceStringFromDouble(withdrawBalance("Oww", 100))))) ?
                                    getNiceStringFromDouble(fundBalance("Oww", 100)) :
                                    "not found such name in database"));
    }
}
