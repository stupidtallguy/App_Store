import java.util.ArrayList;

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
}
