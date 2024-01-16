import java.util.ArrayList;

public class Developer extends Person{
    private ArrayList<App> publishedApps;
    private boolean developerStatus;
    private ArrayList<String> programmingLanguages;
    private String resume;
    private double rating;
    private ArrayList<String> linksToOtherSites;
    private ArrayList<String> skills;
    public Developer(String name, int age, String email) {
        super(name, age, email);
        this.publishedApps = new ArrayList<>();
        this.programmingLanguages = new ArrayList<>();
        this.linksToOtherSites = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.developerStatus = false;
        this.rating = 0.0;
    }
    public ArrayList<App> getPublishedApps() {
        return publishedApps;
    }

    public void setPublishedApps(ArrayList<App> publishedApps) {
        this.publishedApps = publishedApps;
    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getLinksToOtherSites() {
        return linksToOtherSites;
    }

    public void setLinksToOtherSites(ArrayList<String> linksToOtherSites) {
        this.linksToOtherSites = linksToOtherSites;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
    public boolean isDeveloperStatus() {
        return developerStatus;
    }

    public void setDeveloperStatus(boolean developerStatus) {
        this.developerStatus = developerStatus;
    }
}
