package resumeScreeningSystem;

class SoftwareEngineer extends JobRole {
    private int codingProjects;

    public SoftwareEngineer(String candidateName, int experience, int codingProjects) {
        super(candidateName, experience);
        this.codingProjects = codingProjects;
    }

    @Override
    public boolean evaluateResume() {
        return getExperience() >= 2 && codingProjects >= 3;
    }

    @Override
    public String toString() {
        return "[Software Engineer] " + super.toString() + " | Projects: " + codingProjects;
    }
}