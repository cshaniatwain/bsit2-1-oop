public class TestBook {
    public static void main(String[] args) {
        System.out.println("=== Book Record System ===\n");

        System.out.println("Adding books and ratings...");

        Book book1 = new Book("Java Programming", "John Smith");
        try {
            book1.addRating(4);
            System. out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException e) {
            System. out.println("Error: " + e.getMessage());
        }

        Book book2 = new Book("Data Structures", "Alice Brown");
        book2.addMultipleRatings(5, 4, 3, 5);
        try {
            book2.addRating(6); // Invalid
        } catch (IllegalArgumentException e) {
            System. out.println("Error: " + e.getMessage());
        }

        Book book3 = new Book("Web Development", "Bob Wilson");
        book3.addMultipleRatings(4, 3, 3, 3, 3); // 5 ratings for avg 3.2

        System.out.println("\nBook Results:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nTotal books created: " + Book.getTotalBooks());


        Book highest = book1;
        if (book2.getAverageRating() > highest.getAverageRating()) {
            highest = book2;
        }
        if (book3.getAverageRating() > highest.getAverageRating()) {
            highest = book3;
        }

        System.out.printf("Highest rated book: %s by %s (%.2f)\n",
                highest.getTitle(), highest.getAuthor(), highest.getAverageRating());
    }
}
