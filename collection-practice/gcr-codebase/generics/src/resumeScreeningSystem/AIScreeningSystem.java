package resumeScreeningSystem;

import java.util.List;

class AIScreeningSystem {
    public static <T extends JobRole> void screenResumes(List<T> resumes) {
        System.out.println("\n=== Screening Resumes ===");
        for (T resume : resumes) {
            System.out.println(resume + " --> " + (resume.evaluateResume() ? "Selected ✅" : "Rejected ❌"));
        }
    }

    public static void processAllResumes(List<? extends JobRole> resumes) {
        System.out.println("\n=== Processing All Job Roles ===");
        for (JobRole resume : resumes) {
            System.out.println("Candidate: " + resume.getCandidateName() + " | Role: " + resume.getClass().getSimpleName());
        }
    }
}
