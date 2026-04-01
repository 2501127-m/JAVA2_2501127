import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {

    private ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    private void sort() {
        Collections.sort(employees, Comparator.comparing(Employee::getNet).reversed());
    }

    public void display() {
        sort();

        line();
        System.out.printf("%-7s %-4s %-3s %-1s %-3s %7s %10s %7s %7s %7s\n",
                "이름", "사번", "부서", "급", "호봉",
                "기본급", "수당", "공제", "세금", "지급액");
        line();

        for (Employee e : employees) {
            System.out.println(e);
        }

        line();
    }

    private void line() {
        for (int i = 0; i < 80; i++) System.out.print("-");
        System.out.println();
    }
}