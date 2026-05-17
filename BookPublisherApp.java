import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList<Book> bookQueue = new ArrayList<>();

    bookQueue.add(new Book("Head First Java", "Kathy Sierra", 5));
    bookQueue.add(new Book("The Pragmatic Programmer", "Andy Hunt", 5));

    System.out.println("Books have been successfully added to the queue...");

    if (!bookQueue.isEmpty()) {
        Book bookToPublish = bookQueue.get(0);
        publishBook(bookToPublish);
    }
}

public static void publishBook(Book book) {
    System.out.println("\n=================================");
    System.out.println("       📢 READY TO PUBLISH       ");
    System.out.println("=================================");
    System.out.println("📖 Book Title : " + book.title);
    System.out.println("✍️ Author     : " + book.author);
    System.out.print("⭐ Rating     : ");

    for (int i = 0; i < book.rating; i++) {
        System.out.print("⭐");
    }

    System.out.println("\n=================================");
}

