package resumeScreeningSystem;

class DataScientist extends JobRole {
    private int publications;

    public DataScientist(String candidateName, int experience, int publications) {
        super(candidateName, experience);
        this.publications = publications;
    }

    @Override
    public boolean evaluateResume() {
        return getExperience() >= 3 && publications >= 2;
    }

    @Override
    public String toString() {
        return "[Data Scientist] " + super.toString() + " | Publications: " + publications;
    }
}