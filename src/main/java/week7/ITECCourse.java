package week7;

import java.util.ArrayList;
import java.util.List;


public class ITECCourse {
    // class that will create objects that hold class names, code, and max students allowed along with students enrolled

    // data - fields - instance variables
    private String name; // field that holds class name
    private int code; // field that holds class code
    private List<String> students; // list of students that are in the class
    private int maxStudents; // max students who can enroll

    // intellij can generate getters and setters in your class code by pressing the alt + insert keys
    // and clicking getter and setter and clicking the fields you want to generate code for
    // as shown below:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0) {
            return;
        }
        this.maxStudents = maxStudents;
    }

    // END OF GENERATED CODE//

    // constructor that assigns name, code, max students, and students list
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();

    }

    // this method when called adds student to the students list
    public void addStudent(String studentName) {
        // if the size of the array list is equal to the number of max students
        if (students.size() == maxStudents) {
            // unable to add anymore students to the class
            System.out.println("Course is full, can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    // this method when called displays course name, code, student names enrolled and max students allowed to enroll
    public void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        // getNumberOfStudents sends to method to get the size of the students array list
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is  " + maxStudents);
    }

    public int getNumberOfStudents() {
        // returns size of array list... number of students enrolled in class
        return students.size();
    }

    // this method when called
    public void removeStudent(String studentName) {
        // if student name is in the students list
        if (students.contains(studentName)) {
            // remove the student from the list
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + name ); // tells user that name was removed
        } else {
            // if name isn't in the list... program tells the user
            System.out.println(studentName + " was not found in " + name);
        }
    }


}
