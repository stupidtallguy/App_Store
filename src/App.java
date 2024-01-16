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
    public void requestReleaseAccess() {

        Admin.addAppRequest(this);
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public AppLanguage getLanguage() {
        return language;
    }

    public Category getCategory() {
        return category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Developer getDev() {
        return dev;
    }

    public double getPrice() {
        return price;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getSize() {
        return size;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public String getAppName() {
        return appName;
    }

    public Review getReview() {
        return review;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage(AppLanguage language) {
        this.language = language;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
