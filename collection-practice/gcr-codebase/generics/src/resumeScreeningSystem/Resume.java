package resumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

class Resume<T extends JobRole> {
    private List<T> resumeList = new ArrayList<>();

    public void addResume(T resume) {
        resumeList.add(resume);
    }

    public List<T> getResumes() {
        return resumeList;
    }

    public void showAllResumes() {
        for (T resume : resumeList) {
            System.out.println(resume);
        }
    }
}