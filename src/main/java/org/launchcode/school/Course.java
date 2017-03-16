package org.launchcode.school;

import java.util.ArrayList;

/**
 * Created by Erin DeVries on 3/16/2017.
 */
public class Course {
    private String courseName;
    private double courseCredits;
    private ArrayList<String> students;


    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCreditValue() {
        return courseCredits;
    }
    public void setCreditValue(double courseCredits) {
        this.courseCredits = courseCredits;
    }

    public ArrayList<String> getStudentList() {
        return students;
    }
    public void setStudentList(String newStudent){ this.students.add(newStudent); }

    public String toString() { return ("Course Name: " + courseName + ", Credits: " + courseCredits
            + "Student List: " + students); }

    public boolean equals(Object o) {
        return ((Course) o).getCourseName() == getCourseName();
    }
}


