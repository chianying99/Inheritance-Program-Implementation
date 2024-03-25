public class LibraryItem {
    private String title;
    private String author;
    private int itemNum;

    public LibraryItem(String title, String author, int itemNum) {
        this.title = title;
        this.author = author;
        this.itemNum = itemNum;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getItemNum() {
        return itemNum;
    }
}
