void main() throws IOException {
    Customer[] customers = new Customer[] {
            new Home("홍길동", "1234"),
            new Business("홍길동", "2234"),
            new Factory("홍길동", "3234"),
            new Large("경복대", "4567"),
            new Government("홍길동", "1234"),
            new Army("홍길동", "1234"),
            new School("이대한", "2345")
    };

    WaterOffice office = new WaterOffice(customers);
    office.inputData();
    office.display();

}