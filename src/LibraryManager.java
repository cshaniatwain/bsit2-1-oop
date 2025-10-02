import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
        if (item instanceof Book) {
            Book b = (Book) item;
            System.out.println("Added: Book - " + b.getTitle() + " by " + b.getAuthor());
        } else if (item instanceof Magazine) {
            Magazine m = (Magazine) item;
            System.out.println("Added: Magazine - " + m.getTitle() + " by " + m.getAuthor());
        } else if (item instanceof DVD) {
            DVD d = (DVD) item;
            System.out.println("Added: DVD - " + d.getTitle() + " by " + d.getAuthor());
        }
    }

    public void displayAllItems() {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) item;
                System.out.println(li.getItemType() + ": " + li.getTitle() + " (" + li.getBorrowingStatus() + ")");
            }
        }
    }

    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable() && item instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) item;
                System.out.println(li.getItemType() + ": " + li.getTitle() + " (" + li.getBorrowingStatus() + ")");
            }
        }
    }
}
