package org.launchcode.school;

import java.util.HashMap;

/**
 * Created by Erin DeVries on 3/16/2017.
 */
public class CourseStudentManager {
    public static void main(String[] args) {

        HashMap<String, String> columnChoices = new HashMap<>();
        columnChoices.put("student", "Student Menu");
        columnChoices.put("course", "Course Menu");

        HashMap<String, String> studentChoices = new HashMap<>();
        studentChoices.put("add student info", "Add New Student Info");
        studentChoices.put("edit student info", "Edit Student Info");
        studentChoices.put("print student list", "Print Student List");

        HashMap<String, String> courseChoices = new HashMap<>();
        courseChoices.put("add course info", "Add New Course");
        courseChoices.put("edit course info", "Edit Course Info");
        courseChoices.put("print course list", "Print Course List");

        while (true) {

        }
    }
}