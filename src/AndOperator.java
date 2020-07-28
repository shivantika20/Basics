public class AndOperator {
    public static void main(String args[]) {
        double rank = 1.8;

        if (rank == 4.0) {
            System.out.println("You are the best");
        } else if (rank >= 3.5 && rank < 4.0) {
            System.out.println("You have an A grade");
        } else if (rank >= 2.5 && rank < 3.5) {
            System.out.println("You have a B grade");
        } else if (rank >= 1.5 && rank < 2.5) {
            System.out.println("You have a C grade");
        } else {
            System.out.println("You failed");
        }
    }
}
