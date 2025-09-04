package educationsTest.educations;

import education.Education;

public class Doctors implements Education {

    private final int educationDuration;

    public Doctors() {
        this.educationDuration = 7;
    }

    @Override
    public int getEducationDuration() {
        return this.educationDuration;
    }
}
