public class ElectricOffice {
    private ElectricCustomer[] customers;

    public ElectricOffice(ElectricCustomer[] customers) {
        this.customers = customers;
    }

    public void inputData() {
        for (int i = 0; i < customers.length; i++) {
            System.out.println("\n[" + (i + 1) + "번째 사용자]");
            customers[i] = new ElectricCustomer();
            customers[i].input();
        }
    }

    public void sort() {
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[i].getPay() < customers[j].getPay()) {
                    ElectricCustomer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }
    }

    public void display() {
        line();
        System.out.println("번호     이름    사용량     사용요금     세금     납부요금   기타");
        line();

        for (ElectricCustomer c : customers) {
            System.out.println(c);
        }

        line();
    }

    private void line() {
        for (int i = 0; i < 80; i++)
            System.out.print("*");
        System.out.println();
    }
}