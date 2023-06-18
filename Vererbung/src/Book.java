public class Book extends Article {
    private String author, title, publisher;
    private int year;

    Book(int code, String author, String title, int price) {
        super(code, author + title, price);
        this.title = title;
        this.author = author;
    }

    public void showInfo() {
        super.showInfo();

    }
}