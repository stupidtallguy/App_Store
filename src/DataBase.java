import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DataBase {
    private static final ArrayList<App> apps = new ArrayList<>();
    private static final ArrayList<Developer> developers = new ArrayList<>();
    private static final ArrayList<AppUser> users = new ArrayList<>();
    private static final ArrayList<Review> reviews = new ArrayList<>();

    public static void addApp(App App){
        apps.add(App);
    }

    public static ArrayList<App> getApps() {
        return apps;
    }

    public static ArrayList<AppUser> getUsers() {
        return users;
    }

    public static ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public static ArrayList<Review> getReviews() {
        return reviews;
    }
    public static void addDeveloper(Developer developer) {
        developers.add(developer);
    }
    public static void addUser(AppUser user) {
        users.add(user);
    }
    public static void addReview(Review review) {
        reviews.add(review);
    }
    
    private static void sortAppsByCategory() {
        // Sort the apps list based on categories
        Collections.sort(apps, Comparator.comparing(App::getCategory));
    }

    private static int binarySearchByCategory(Category targetCategory) {
        int left = 0;
        int right = apps.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Category midCategory = apps.get(mid).getCategory();

            int comparisonResult = midCategory.compareTo(targetCategory);

            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Category not found
    }
}
