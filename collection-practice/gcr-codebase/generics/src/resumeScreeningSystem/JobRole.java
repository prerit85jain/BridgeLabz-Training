package resumeScreeningSystem;

abstract class JobRole {
    private String candidateName;
    private int experience; // in years

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    public abstract boolean evaluateResume();

    @Override
    public String toString() {
        return candidateName + " | Experience: " + experience + " years";
    }
}