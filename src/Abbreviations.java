import java.util.Scanner;

public class Abbreviations {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String input = sc.nextLine();
        String output = "";
        String[] str = input.split(" ");
        for(int i =0;i <str.length-1;i++)
        {
            output = output+str[i].charAt(0)+".";
        }
        System.out.println(output+str[str.length-1]);
    }
}

