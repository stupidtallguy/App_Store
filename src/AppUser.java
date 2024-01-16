import java.util.ArrayList;

public class AppUser extends Person{
    private ArrayList<App> PurchasedApps;
    private ArrayList<Category> interests;
    private ArrayList<App> CommentedApps;
    private ArrayList<App> ratedApps;
    private double balance;
    private ArrayList<App> WishLists;
    private ArrayList<String> Notifications;
    private ArrayList<App> Updates;

    public AppUser(String Name, int Age, String Email) {
        super(Name, Age, Email);
    }
}
