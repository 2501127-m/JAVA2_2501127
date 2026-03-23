public class TV {

    private String brand;
    private int year;
    private int size;
    private String type;

    public TV(String brand, int year, int size, String type) {
        this.brand = brand;
        this.year = year;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("우리집 TV는 %s에서 만든 %d년형 %d 인치 %s TV 입니다.",
                brand, year, size, type);
    }
}