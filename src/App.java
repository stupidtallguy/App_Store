import java.util.*;


public class App {
    private ArrayList<Review> reviews;
    private String version;
    private Developer dev;
    private String appName;
    private Category category;
    private String description;
    private Purchase purchase;
    private int size;
    private Review review;
    private int ageRating;
    private AppLanguage language;
    private double price;
    private Date releaseDate;
    private boolean releaseAccess;
    public App(String appName, Category category, Developer developer, double price, String description) {
        this.appName = appName;
        this.category = category;
        this.dev = developer;
        this.price = price;
        this.description = description;
        this.releaseAccess = false; // By default, set releaseAccess to false
        this.reviews = new ArrayList<>();
    }
    //Ss And Gs
    public void setVersion(String version){
        this.version = version;
    }
    public void setDev(Developer dev){
        this.dev = dev;
    }
    public void addReview(AppUser reviewer, int rating, String comment) {
        Review review = new Review(this, reviewer, rating, comment);
        reviews.add(review);
    }
    public boolean isReleaseAccess(){
        return releaseAccess;
    }
    public void setReleaseAccess(boolean releaseAccess){
        this.releaseAccess = releaseAccess;
        if(releaseAccess){
            DataBase.addApp(this);
        }
    }

}
