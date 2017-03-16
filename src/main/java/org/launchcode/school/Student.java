package org.launchcode.school;

/**
 * Created by Erin DeVries on 3/16/2017.
 */
public class Student {
    private static int nextStudentID = 1;
    private String name;
    private final int studentID;
    private int credits;
    private double gpa;
    private String gradeLevel;

    public Student(String name, int studentID, int credits, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.credits = credits;
        this.gpa = gpa;
    }

    public Student(String name, int studentID) {
        this(name, studentID, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentID);
        nextStudentID++;
    }

    public void addGrade(int courseCredits, double grade) {
        if (grade >= 90.0){
            grade = 4.0;
        }else if (90.0 > grade && grade >= 80.0) {
            grade = 3.0;
        }else if (80.0 > grade && grade >= 70.0) {
            grade = 2.0;
        }else if (70.0> grade && grade >= 60.0) {
            grade = 1.0;
        }else {
            grade = 0.0;
        }
        double qScore = (grade * courseCredits);
        this.credits += courseCredits;
        this.gpa = qScore / credits;
    }

    public void getGradeLevel() {
        if (credits >= 90) {
            gradeLevel = "Senoir";
        }else if (89>= credits && credits >= 60) {
            gradeLevel = "Junior";
        }else if (59>= credits && credits >= 30) {
            gradeLevel = "Sophmore";
        }else {
            gradeLevel = "Freshman";
        }
    }

    public String toString() {
        return name + "(Credits: " + credits + ", GPA: " +
                gpa + ")";
    }

    public boolean equals(Object o) {
        return ((Student) o).getStudentID() == getStudentID();
    }

    public Student(int studentID){
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getCredits() { return credits; }
    public void setCredits(int aCredits) {
        credits = aCredits;
    }

    public double getGPA() {
        return gpa;
    }
    public void setGPA(double aGPA) {
        gpa = aGPA;
    }

}
