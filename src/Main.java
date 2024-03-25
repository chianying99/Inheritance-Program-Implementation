public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1, 192);
        Magazine magazine1 = new Magazine("Super Elle", "Xiao Xue", 1, 100);
        DVD dvd1 = new DVD("Barbie", "Greta Gerwig", 3 ,114);

        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book Author: " + book1.getAuthor());
        System.out.println("Book Num: " + book1.getItemNum());
        System.out.println("Number of Pages: " + book1.getNumPages());

        System.out.println(" ");

        System.out.println("\nMagazine Title: " + magazine1.getTitle());
        System.out.println("Magazine Author: " + magazine1.getAuthor());
        System.out.println("Magazine Num: " + magazine1.getItemNum());
        System.out.println("Issue Number: " + magazine1.getIssueNumber());

        System.out.println(" ");

        System.out.println("\nDVD Title: " + dvd1.getTitle());
        System.out.println("DVD Author: " + dvd1.getAuthor());
        System.out.println("DVD Num: " + dvd1.getItemNum());
        System.out.println("Run Time: " + dvd1.getRunTime() + " minutes");
    }
}