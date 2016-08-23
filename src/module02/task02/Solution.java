package module02.task02;


public class Solution {

    //HOMEWORK 2.1

    // It can remove unnecessary zeros in the end of double
    public static String getNiceStringFromDouble(double d) {
        int i = (int) d;
        return i == d ? String.valueOf(i) : String.valueOf(d);
    }

    static double withdrawBalance(double balance, double withdrawal) {
        double newBalance = balance - withdrawal * 1.05;

        if (newBalance < 0) {
            System.out.println("NO");
            return balance;
        }  else {
            System.out.println("OK " + getNiceStringFromDouble(withdrawal * 0.05) + " " +
                    getNiceStringFromDouble(newBalance));
            return newBalance;
        }
    }

    //HOMEWORK 2.2

    static String[] getOwnerNamesArray() {
        return new String[]{"Jane", "Ann", "Jack", "Oww", "Lane"};
    }

    static int[] getBalancesArray() {
        return new int[]{1200, 250, 2000, 500, 3200};
    }

    // method returns -1 if fails
    static double withdrawBalance(String ownerName, double withdrawal) {
        String[] names = getOwnerNamesArray();
        int[] balances = getBalancesArray();
        for (int i = 0; i < names.length; i++)
            if (ownerName.equals(names[i])) {
                double newBalance = balances[i] - withdrawal * 1.05;
                if (newBalance < 0) {
                    System.out.println("NO " + names[i]);
                    return balances[i];
                }
                else {
                    System.out.println(names[i] + " " + getNiceStringFromDouble(withdrawal) + " " +
                            getNiceStringFromDouble(newBalance));
                    return newBalance;
                }
            }
        return -1;
    }

    //HOMEWORK 2.3

    // method returns -1 if fails
    static double fundBalance(String ownerName, double fund) {
        String[] names = getOwnerNamesArray();
        int[] balances = getBalancesArray();
        for (int i = 0; i < names.length; i++)
            if (ownerName.equals(names[i])) {
                double newBalance = balances[i] + fund;
                System.out.println(names[i] + " " + getNiceStringFromDouble(newBalance));
                return newBalance;
            }
        return -1;
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int[] balances1 = {200, 200, 500, 4000, 30};

        // some testing
        withdrawBalance(100, 10);
        withdrawBalance(100, 99);
        withdrawBalance("Ann", 100);
        withdrawBalance("Oww", 490);
        fundBalance("Oww", 100);
    }
}
