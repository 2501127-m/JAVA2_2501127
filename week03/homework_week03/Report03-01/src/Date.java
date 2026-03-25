public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("(%4d년 %2d월 %2d일)", year, month, day);
    }
}