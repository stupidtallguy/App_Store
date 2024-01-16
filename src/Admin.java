import java.util.ArrayList;

public class Admin {
    private static Admin instance = new Admin();
    private static ArrayList<App> appRequests;
    private ArrayList<Developer> developerRequests;

    private Admin() {
        this.appRequests = new ArrayList<>();
        this.developerRequests = new ArrayList<>();
    }
    public static Admin getInstance() {
        return instance;
    }
    public static void addAppRequest(App app) {
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
