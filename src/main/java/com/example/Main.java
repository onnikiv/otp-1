package com.example;

import java.util.Scanner;

import com.example.educations.Batchelors;
import com.example.educations.Doctors;
import com.example.educations.Masters;

public class Main {

    public static void main(String[] args) {
        Education batchelor = new Batchelors();
        Education masters = new Masters();
        Education doctors = new Doctors();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter which of the educations duration you wish to know:");
            System.out.println("(1) - Batchelors ");
            System.out.println("(2) - Masters");
            System.out.println("(3) - Doctors");

            String input = scanner.next();

            switch (input) {
                case "1" ->
                    System.out.println("Duration of Batchelors is: " + batchelor.getEducationDuration());
                case "2" ->
                    System.out.println("Duration of Masters is: " + masters.getEducationDuration());
                case "3" ->
                    System.out.println("Duration of Doctors is: " + doctors.getEducationDuration());
                default ->
                    System.out.println("Input Error!");
            }
        }
    }
}
