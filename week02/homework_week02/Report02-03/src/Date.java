public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static boolean isValidDate(int year, int month, int day) {

        if (month < 1 || month > 12) return false;

        int[] days = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            days[1] = 29;
        }

        return day >= 1 && day <= days[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", year, month, day);
    }
}