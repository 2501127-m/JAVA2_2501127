import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ElectricCustomer[] customers = new ElectricCustomer[10];

        ElectricOffice office = new ElectricOffice(customers);
        office.inputData();
        office.sort();
        office.display();
    }
}