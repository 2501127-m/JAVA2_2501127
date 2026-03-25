public class Student {

    private String name;
    private String rollno;
    private String depart;
    private Date birthday;

    public Student(String name, String rollno, String depart, Date birthday) {
        this.name = name;
        this.rollno = rollno;
        this.depart = depart;
        this.birthday = birthday;
    }

    public int getAge() {
        int currentYear = 2026;
        return currentYear - getBirthYear();
    }

    public int getBirthYear() {
        return birthdayYear();
    }

    private int birthdayYear() {
        String str = birthday.toString();
        return Integer.parseInt(str.substring(1, 5));
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 학번: %s, 학과: %s, 생년월일: %s",
                name, rollno, depart, birthday);
    }
}