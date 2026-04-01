import java.io.IOException;
import java.util.Scanner;

public class Employee {

    private String id;
    private String name;
    private int part;
    private boolean special;
    private int grade;
    private int clazz;
    private int aid;

    public void input() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("사번(5자리): ");
        id = sc.next();

        System.out.print("이름: ");
        name = sc.next();

        System.out.print("부서코드(1~5): ");
        part = sc.nextInt();

        System.out.print("보훈여부(true/false): ");
        special = sc.nextBoolean();

        System.out.print("직급(1~3): ");
        grade = sc.nextInt();

        System.out.print("호봉(1~5): ");
        clazz = sc.nextInt();

        while (true) {
            System.out.print("공제액(<=300000): ");
            aid = sc.nextInt();
            if (aid <= 300000) break;
            System.out.println("300000 이하로 입력!");
        }
    }

    private int baseSalary() {
        int[][] table = {
                {1250000, 950000, 750000},
                {1200000, 925000, 725000},
                {1150000, 900000, 700000},
                {1100000, 875000, 675000},
                {1050000, 850000, 650000}
        };
        return table[clazz - 1][grade - 1];
    }

    private int gradeAllowance() {
        switch (grade) {
            case 1: return 300000;
            case 2: return 200000;
            case 3: return 100000;
        }
        return 0;
    }

    private int workAllowance() {
        switch (part) {
            case 1:
            case 2: return 250000;
            case 3:
            case 4: return 350000;
            case 5: return 300000;
        }
        return 0;
    }

    private int totalAllowance() {
        return gradeAllowance() + workAllowance();
    }

    private int deduction() {
        int base = (int)(baseSalary() * 0.03);
        return base + aid;
    }

    private int taxable() {
        return (baseSalary() + totalAllowance()) - deduction();
    }

    private int tax() {
        int t = taxable();

        if (special) {
            return (int)(baseSalary() * 0.03); // 보훈 대상자
        }

        if (t < 700000) return 0;
        else if (t < 800000) return (int)(t * 0.05);
        else if (t < 1000000) return (int)(t * 0.07);
        else return (int)(t * 0.09);
    }

    public int getNet() {
        return (baseSalary() + totalAllowance()) - tax() - deduction();
    }

    @Override
    public String toString() {
        return String.format("%-6s %-6s %-4d %-3d %-3d %10d %10d %10d %10d %10d",
                name, id, part, grade, clazz,
                baseSalary(),
                totalAllowance(),
                deduction(),
                tax(),
                getNet());
    }
}