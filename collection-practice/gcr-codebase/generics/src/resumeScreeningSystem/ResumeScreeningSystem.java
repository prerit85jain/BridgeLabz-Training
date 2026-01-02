package resumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(new SoftwareEngineer("Alice", 3, 4));
        seResumes.addResume(new SoftwareEngineer("Bob", 1, 2));

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(new DataScientist("Charlie", 4, 3));
        dsResumes.addResume(new DataScientist("Diana", 2, 1));

        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addResume(new ProductManager("Eve", 5, 6));
        pmResumes.addResume(new ProductManager("Frank", 3, 4));

        System.out.println("--- Software Engineer Resumes ---");
        seResumes.showAllResumes();

        System.out.println("\n--- Data Scientist Resumes ---");
        dsResumes.showAllResumes();

        System.out.println("\n--- Product Manager Resumes ---");
        pmResumes.showAllResumes();

        AIScreeningSystem.screenResumes(seResumes.getResumes());
        AIScreeningSystem.screenResumes(dsResumes.getResumes());
        AIScreeningSystem.screenResumes(pmResumes.getResumes());

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.addAll(seResumes.getResumes());
        allResumes.addAll(dsResumes.getResumes());
        allResumes.addAll(pmResumes.getResumes());

        AIScreeningSystem.processAllResumes(allResumes);
    }
}