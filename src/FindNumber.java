import java.util.*;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 10;
        int num[] = new int[l];
        int flag = 0;
        System.out.println("Enter the array ");
        for (int i = 0; i < l; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == number) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Number is present in the array");
        }
        else {
            System.out.println("Number is not present");
        }
    }
}
