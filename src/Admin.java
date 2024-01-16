import java.util.ArrayList;

public class Admin {
    private static Admin instance = new Admin();
    private final String username = "Admin";
    private final String password = "Admin";
    private final String name = "Admin";
    private final String email = "Admin@gmail.com";
    private final int age = 85;
    private ArrayList<App> appRequests;
    private ArrayList<Developer> developerRequests;

    private Admin() {
        this.appRequests = new ArrayList<>();
        this.developerRequests = new ArrayList<>();
    }
    public void addAppRequest(App app) {
        appRequests.add(app);
    }

    public void approveAppRequest(App app) {
        app.setReleaseAccess(true);
        appRequests.remove(app);
    }

    public void rejectAppRequest(App app) {
        appRequests.remove(app);
    }

    public void addDeveloperRequest(Developer developer) {
        developerRequests.add(developer);
    }

    public void approveDeveloperRequest(Developer developer) {
        developer.setDeveloperStatus(true);
        developerRequests.remove(developer);
    }

    public void rejectDeveloperRequest(Developer developer) {
        developerRequests.remove(developer);
    }
}
