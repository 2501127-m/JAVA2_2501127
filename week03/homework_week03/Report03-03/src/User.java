public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        System.out.printf("%s님이 '%s' 책을 대출합니다.\n", name, book.getTitle());
    }

    public void returnBook(Book book) {
        System.out.printf("%s님이 '%s' 책을 반납합니다.\n", name, book.getTitle());
    }
}