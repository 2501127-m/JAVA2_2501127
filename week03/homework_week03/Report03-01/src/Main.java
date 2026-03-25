public class Main {
    public static void main(String[] args) {

        Date birthday = new Date(2000, 5, 10);

        Student s1 = new Student("홍길동", "2023001", "컴퓨터공학과", birthday);

        System.out.println(s1);
        System.out.println("나이: " + s1.getAge());

    }
}