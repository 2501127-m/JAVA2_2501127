public class Library {

    public void lendBook(User user, Book book) {
        if (!book.isBorrowed()) {
            book.borrow();
            user.borrowBook(book);
        } else {
            System.out.println("이미 대출된 책입니다.");
        }
    }

    public void receiveBook(User user, Book book) {
        if (book.isBorrowed()) {
            book.returnBook();
            user.returnBook(book);
        } else {
            System.out.println("대출되지 않은 책입니다.");
        }
    }
}