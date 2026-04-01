import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("사원 수 입력: ");
        int n = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            Employee e = new Employee();
            e.input();
            list.add(e);
        }

        Company company = new Company(list);
        company.display();
    }
}