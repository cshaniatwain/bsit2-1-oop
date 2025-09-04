import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
    }

    public void addMultipleRatings(int... ratingsArray) {
        System.out.print("Ratings added: ");
        boolean isFirst = true;
        for (int rating : ratingsArray) {
            try {
                addRating(rating);
                if (!isFirst) System.out.print(", ");
                System.out.print(rating);
                isFirst = false;
            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println();
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        double avg = (double) sum / ratings.size();
        return Math.round(avg * 100.0) / 100.0; // round to 2 decimal places
    }

    public String getPopularityLevel() {
        if (ratings.isEmpty()) {
            return "No ratings";
        }
        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        else if (avg >= 3.5) return "Good";
        else if (avg >= 2.5) return "Average";
        else if (avg >= 1.5) return "Poor";
        else return "Terrible";
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Book: " + title + " by " + author +
                ", Average Rating: " + getAverageRating() +
                ", Level: " + getPopularityLevel();
    }
}
