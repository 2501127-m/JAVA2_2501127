public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder(4, 5);
        System.out.println(adder);

        Adder[] adders = new Adder[] {
                new Adder(4, 5),
                new Adder(8, 9),
                new Adder(12, 56)};

        for (int i = 0; i < adders.length; i++) {
            System.out.println(adders[i]);
        }

    }
}