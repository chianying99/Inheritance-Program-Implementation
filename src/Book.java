public class Book extends LibraryItem {
    private int numPages;

    public Book(String title, String author, int itemNum, int numPages) {
        super(title, author, itemNum);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }
}
