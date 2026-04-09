import java.util.Scanner;

public class ElectricCustomer {
    private String name;
    private String userNo;
    private int usage;
    private final int BASIC = 1660;

    public ElectricCustomer() {}

    public void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("사용자 번호 입력(5자리): ");
            userNo = sc.next();

            if (userNo.length() == 5)
                break;
            else
                System.out.println("ERROR: 5자리 입력");
        }

        System.out.print("이름 입력: ");
        name = sc.next();

        while (true) {
            System.out.print("사용량 입력(Kw): ");
            usage = sc.nextInt();

            if (usage >= 0 && usage <= 9999)
                break;
            else
                System.out.println("ERROR: 사용량 범위 오류");
        }
    }

    private boolean isSupport() {
        return userNo.charAt(0) == '9';
    }

    private double calcFee() {
        int remain = usage;
        double fee = 0;

        if (isSupport()) {
            if (remain <= 100) return 0;
            remain -= 100;
        }

        int[] limits = {100, 100, 100, 100, 100};
        double[] rates = {184.1, 223.8, 278.3, 353.6, 466.4};

        for (int i = 0; i < limits.length; i++) {
            int use = Math.min(remain, limits[i]);
            fee += use * rates[i];
            remain -= use;
            if (remain <= 0) break;
        }

        if (remain > 0) {
            fee += remain * 643.9;
        }

        return fee;
    }

    private int useAmount() {
        return (int)(BASIC + calcFee());
    }

    private int tax() {
        return (int)(useAmount() * 0.07);
    }

    public int getPay() {
        return useAmount() + tax();
    }

    @Override
    public String toString() {
        return String.format("%5s %6s %6dKw %,10d원 %,8d원 %,10d원 %s",
                userNo, name, usage,
                useAmount(),
                tax(),
                getPay(),
                isSupport() ? "지원" : "");
    }
}