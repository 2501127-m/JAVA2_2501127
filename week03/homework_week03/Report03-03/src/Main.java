public class Main {
    public static void main(String[] args) {

        Book book = new Book("Java Programming");
        User user = new User("홍길동");
        Library lib = new Library();

        lib.lendBook(user, book);
        lib.receiveBook(user, book);
    }
}