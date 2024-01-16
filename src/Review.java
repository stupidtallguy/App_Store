import java.util.ArrayList;

public class Review {
    private double rating;
    private String comment;
    private AppUser reviewer;
    private App app;
    public Review(App app, AppUser reviewer, int rating, String comment) {
        this.app = app;
        this.reviewer = reviewer;
        this.rating = rating;
        this.comment = comment;
    }

}
