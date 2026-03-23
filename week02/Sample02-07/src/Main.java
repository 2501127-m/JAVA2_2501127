import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 이름은 ");
        String name = keyboard.nextLine();
        System.out.print("당신의 나이는 ");
        int age = keyboard.nextInt();

        Message message = new Message(name, age);
        message.show(name, age);
        System.out.println(message);

    }
}