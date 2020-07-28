public class OrOperator {
    public static void main(String args[]) {
        double account_balance = 200000.00;
        int age = 29;
        if (account_balance >= 10000000 || age <= 30) {
            System.out.println("You have enough balance, please retire");
        } else {
            System.out.println("Keep working till you have enough to spend");
        }
    }
}
