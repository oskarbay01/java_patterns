package behavioral.observer;

public class JobSiteRunner {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancy("First position");
        jobSite.addVacancy("Second position");

        Subscriber subscriber1 = new Subscriber("Askar");
        Subscriber subscriber2 = new Subscriber("Zhassulan");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Third position");
        jobSite.removeVacancy("Second position");
    }
}
