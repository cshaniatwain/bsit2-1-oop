public class Main {
    public static void main(String[] args) {
      
        System.out.println("== Library Management System ==");

      
        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

       
        Library library = new Library(10);

       
        System.out.println("\nAdding books to Library...");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

       
        library.displayAllBooks();

        
        System.out.println("\nBorrowing Java Programming...");
        library.borrowBook("1234567890");

        
        System.out.println("\nTrying to borrow Java Programming again...");
        library.borrowBook("1234567890");

        
        System.out.println("\nAvailable books:");
        library.displayAvailableBooks();

       
        System.out.println("\nReturning Java Programming...");
        library.returnBook("1234567890");

      
        System.out.println("\nAvailable books:");
        library.displayAvailableBooks();

       
        System.out.println("\nTesting validation...");
        try {
            
            new Book("Invalid Book", "Invalid Author", "12345", 3000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
          
            new Book("Another Invalid Book", "Another Author", "1234", 2022);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
