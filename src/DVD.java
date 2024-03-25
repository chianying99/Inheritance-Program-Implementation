public class DVD extends LibraryItem {
    private int runTime;

    public DVD(String title, String author, int itemNum, int runTime) {
        super(title, author, itemNum);
        this.runTime = runTime;
    }

    public int getRunTime() {
        return runTime;
    }
}
