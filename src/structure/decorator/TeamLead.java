package structure.decorator;

public class TeamLead extends DeveloperDecorator {
    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendReport() {
        return " Send reports a costumer";
    }

    @Override
    public String makejob() {
        return super.makejob() + sendReport();
    }
}
