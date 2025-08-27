import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;
        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        else return "Poor";
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        Set<String> uniqueSet = new HashSet<>();
        for (String tag : hashtags) {
            uniqueSet.add(tag);
        }
        return new ArrayList<>(uniqueSet);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        return new HashSet<>(Arrays.asList(authors));
    }

    public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagementScore = manager.calculateEngagement(150, 75, 25); 
        String category = manager.getCategoryRating(engagementScore);

        System.out.println("--- Social Media Post Manager ---");
        manager.displayPostStats(postTitle, engagementScore, category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> engagementMap = new HashMap<>();
        engagementMap.put("Advanced Java Tutorial", 750);
        engagementMap.put("Spring Boot Guide", 680);

        LinkedList<String> trending = manager.findTrendingPosts(posts, engagementMap);
        System.out.println("Trending Posts: " + trending);

        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
