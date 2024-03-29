import java.util.Scanner;

public class checkNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = input.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) isLeapYear = true;
                else isLeapYear = false;
            }
        }

        if (isLeapYear) System.out.printf("%d is a leap year", year);
        else System.out.printf("%d is NOT a leap year", year);
    }
}
