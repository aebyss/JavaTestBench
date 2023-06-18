public class Article {
    private int code; // article number
    private String label; // short description
    private int price;

    public Article(int code, String label, int price) {
        this.code = code;
        this.label = label;
        this.price = price;
    }

    public void showInfo() {
    }

    public String getArticleLine() {
        return label;
    }

    public static void main(String[] args) {
        Book b = new Book(22, "edin", "na zrnu graska", 222);
        b.showInfo();

    }

}
