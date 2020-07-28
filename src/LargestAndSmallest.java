import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int length = sc.nextInt();
        int nums[] = new int[length];
        System.out.println("Enter the Array");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        int ln = nums[0];
        int sn = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (ln < nums[i]) {
                ln = nums[i];
            }else if (sn > nums[i]){
                sn = nums[i];
            }
        }
        System.out.println(ln);
        System.out.println(sn);
    }
}

