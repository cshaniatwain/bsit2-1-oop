public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("═══ LIBRARY MANAGEMENT SYSTEM TEST ═══\n");

        LibraryManager manager = new LibraryManager();

 
        System.out.println("══ Adding Items to Library ══");
        Book book1 = new Book("B001", "Java Programming", "James Gosling", "9780132350884", 550, "Programming");
        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 101, "June", true);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");

        manager.addItem(book1);
        manager.addItem(mag1);
        manager.addItem(dvd1);

      
        System.out.println("\n══ Displaying All Items ══");
        manager.displayAllItems();

        Student student = new Student("U001", "John Smith", "john@mail.com", "S123", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "smith@uni.edu", "Engineering", "Professor");

        System.out.println("\n══ Testing Borrowing ══");
        if (book1.isAvailable()) {
            book1.borrowItem(student.getName());
            student.addBorrowedItem(book1);
            System.out.println("Student " + student.getName() + " borrowed: " + book1.getTitle());
        }

        if (dvd1.isAvailable()) {
            dvd1.borrowItem(faculty.getName());
            faculty.addBorrowedItem(dvd1);
            System.out.println("Faculty " + faculty.getName() + " borrowed: " + dvd1.getTitle());
        }

        System.out.println("\n══ Displaying Available Items ══");
        manager.displayAvailableItems();

        System.out.println("\n══ Testing Late Fees ══");
        System.out.printf("%s - 5 days late: $%.2f%n", book1.getTitle(), book1.calculateLateFee(5));
        System.out.printf("%s - 3 days late: $%.2f%n", dvd1.getTitle(), dvd1.calculateLateFee(3));

        System.out.println("\n══ Testing User Information ══");
        System.out.printf("Student: %s (%s) - %d items borrowed%n",
                student.getName(), student.getMajor(), student.getBorrowedItemsCount());
        System.out.printf("Faculty: %s (%s) - %d items borrowed%n",
                faculty.getName(), faculty.getDepartment(), faculty.getBorrowedItemsCount());
    }
}
