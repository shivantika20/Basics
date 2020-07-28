public class Switch {
    public static void main(String args[]) {
        String grade = "B+";
        switch (grade) {
            case "A+":
            case "A":
            case "A-":
                System.out.println("Good Job");
                break;
            case "B+":
            case "B":
            case "B-":
                System.out.println("You can do better");
                break;
            case "C+":
            case "C":
            case "C-":
                System.out.println("Average Performance");
                break;
            case "D+":
            case "D":
            case "D-":
                System.out.println("Poor Performance, yet just managed to pass");
                break;
            default:
                System.out.println("You Failed");
                break;
        }
    }
}
