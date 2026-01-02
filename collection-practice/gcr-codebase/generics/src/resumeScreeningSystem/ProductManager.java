package resumeScreeningSystem;

class ProductManager extends JobRole {
    private int managedProjects;

    public ProductManager(String candidateName, int experience, int managedProjects) {
        super(candidateName, experience);
        this.managedProjects = managedProjects;
    }

    @Override
    public boolean evaluateResume() {
        return getExperience() >= 4 && managedProjects >= 5;
    }

    @Override
    public String toString() {
        return "[Product Manager] " + super.toString() + " | Managed Projects: " + managedProjects;
    }
}