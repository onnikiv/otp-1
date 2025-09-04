package com.example.educations;

import com.example.Education;

public class Batchelors implements Education {

    private final int educationDuration;

    public Batchelors() {
        this.educationDuration = 3;
    }

    @Override
    public int getEducationDuration() {
        return this.educationDuration;
    }

}
