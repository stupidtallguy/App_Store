import java.util.Date;

public class Purchase {
    private App app;
    private AppUser user;
    private double purchasePrice;
    private Date timestamp;

    public Purchase(App app, AppUser user, double purchasePrice) {
        this.app = app;
        this.user = user;
        this.purchasePrice = purchasePrice;
        this.timestamp = new Date();
    }

    public App getApp() {
        return app;
    }

    public AppUser getUser() {
        return user;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
