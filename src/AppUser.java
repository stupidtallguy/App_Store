import java.util.ArrayList;

public class AppUser extends Person{
    private ArrayList<App> purchasedApps;
    private ArrayList<Category> interests;
    private ArrayList<App> commentedApps;
    private ArrayList<App> ratedApps;
    private double balance;
    private ArrayList<App> wishList;
    private ArrayList<String> notifications;
    private ArrayList<App> updates;

    public AppUser(String name, int age, String email) {
        super(name, age, email);
        this.purchasedApps = new ArrayList<>();
        this.balance = 0.0; // Initial balance is set to 0
        this.interests = new ArrayList<>();
        this.wishList = new ArrayList<>();
    }

    public ArrayList<App> getCommentedApps() {
        return commentedApps;
    }

    public ArrayList<App> getPurchasedApps() {
        return purchasedApps;
    }

    public ArrayList<App> getRatedApps() {
        return ratedApps;
    }

    public ArrayList<App> getUpdates() {
        return updates;
    }

    public ArrayList<App> getWishLists() {
        return wishList;
    }

    public ArrayList<Category> getInterests() {
        return interests;
    }

    public ArrayList<String> getNotifications() {
        return notifications;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCommentedApps(App commentedApp) {
        this.commentedApps.add(commentedApp);
    }

    public void setInterests(Category interest) {
        this.interests.add(interest);
    }

    public void setNotifications(String notification) {
        this.notifications.add(notification);
    }
    public void purchaseApp(App app) {
        // Implement logic for app purchase, deduct balance, add to purchased apps, etc.
        if (balance >= app.getPrice()) {
            balance -= app.getPrice();
            purchasedApps.add(app);
            System.out.println("Purchase successful: " + app.getAppName());
        } else {
            System.out.println("Insufficient balance for purchase: " + app.getAppName());
        }
    }

    public void addToWishlist(App app) {
        // Implement logic for adding an app to the wishlist
        wishList.add(app);
        System.out.println("Added to wishlist: " + app.getAppName());
    }
}
