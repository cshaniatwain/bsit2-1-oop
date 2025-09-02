import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);

        // Initialize with sample books
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
    }

    public void showBooks() {
        System.out.println("\n--- Current Books ---");
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized.");
            }

            if (books.isEmpty()) {
                System.out.println("No books available.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.printf("%d. %s\n", i + 1, books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.");
        }
    }

    public void addBook() {
        System.out.print("\nEnter book title to add: ");
        try {
            String title = scanner.nextLine().trim();

            if (title.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }

            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }

            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 
        } finally {
            System.out.println("Add book operation completed.");
        }
    }

    public void removeBook() {
        if (books.isEmpty()) {
            System.out.println("\nNo books to remove.");
            System.out.println("Remove book operation completed.");
            return;
        }

        System.out.print("\nEnter book number to remove (1-" + books.size() + "): ");
        try {
            String input = scanner.nextLine();
            int index = Integer.parseInt(input);

            if (index < 1) {
                throw new IllegalArgumentException("Book number must be positive.");
            }

            if (index > books.size()) {
                throw new ArrayIndexOutOfBoundsException("Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removedBook = books.remove(index - 1);
            System.out.println("Book '" + removedBook + "' removed successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!"); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
        }
    }

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        System.out.println("=== Library Management System ===");
        manager.showBooks();

        manager.addBook();

        manager.addBook();

        manager.addBook();

        manager.removeBook();

        manager.removeBook();

        manager.removeBook();

        System.out.println("\nProgram completed successfully.");
    }
}
