package educations;

import com.example.Education;

public class Masters implements Education {

    private final int educationDuration;

    public Masters() {
        this.educationDuration = 5;
    }

    @Override
    public int getEducationDuration() {
        return this.educationDuration;
    }
}
