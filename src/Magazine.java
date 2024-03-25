public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int itemNum, int issueNumber) {
        super(title, author, itemNum);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
