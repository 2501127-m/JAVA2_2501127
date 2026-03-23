import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("생년월일 입력 (year month day): ");
        Date birthday = inputDate(keyboard);

        System.out.print("오늘 날짜 입력 (year month day): ");
        Date today = inputDate(keyboard);

        System.out.print("날짜 입력 (year month day): ");
        Date testDate = inputDate(keyboard);

        if (birthday != null) System.out.println("Birthday: " + birthday);
        if (today != null) System.out.println("Today: " + today);
        if (testDate != null) {
            System.out.println("Input Date: " + testDate);

            testDate.setYear(2023);
            System.out.println("Year changed to 2023: " + testDate);
        }
    }

    public static Date inputDate(Scanner keyboard) {
        int year = keyboard.nextInt();
        int month = keyboard.nextInt();
        int day = keyboard.nextInt();

        if (!Date.isValidDate(year, month, day)) {
            System.out.println("오류");
            return null;
        }

        return new Date(year, month, day);
    }
}