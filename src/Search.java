public class Search {
    public static void main(String[] args) {
        String input = "This is orange orange juice";
        String[] str = input.split(" ");
        String output = "orange not present";
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("orange")) {
                output = "orange present";
                break;
            }
        }
        System.out.println(output);
    }
}

