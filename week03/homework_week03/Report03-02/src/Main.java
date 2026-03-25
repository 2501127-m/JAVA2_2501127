public class Main {
    public static void main(String[] args) {

        Teacher younghee = new Teacher("영희", 24);
        Doctor chulsoo = new Doctor("철수", 45);
        Engineer minsu = new Engineer("민수", 35);

        younghee.introduce();
        chulsoo.introduce();
        minsu.introduce();

        younghee.teach();
        younghee.grade();

        chulsoo.treat();
        chulsoo.surgery();

        minsu.develop();
        minsu.fixBug();
    }
}