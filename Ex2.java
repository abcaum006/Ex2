import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Scanner inp = new Scanner(System.in);
        List<Integer> nums = getValidIntegers(inp);
        inp.close();

        printSortedNumbers(nums);
    }

    private static List<Integer> getValidIntegers(Scanner inp) {
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < MAX) {
            String s = inp.nextLine();

            if (isValidInteger(s)) {
                int num = Integer.parseInt(s);

                if (isValidRange(num)) {
                    nums.add(num);
                } else {
                    System.out.println("Invalid range! Try again!");
                }
            } else {
                System.out.println("Invalid! Try again!");
            }
        }

        return nums;
    }

    private static boolean isValidInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean isValidRange(int num) {
        return num >= 0 && num <= 10;
    }

    private static void printSortedNumbers(List<Integer> nums) {
        Collections.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
