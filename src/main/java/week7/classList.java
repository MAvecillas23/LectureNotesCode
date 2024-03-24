package week7;

import java.util.ArrayList;
import java.util.List;

public class classList {
        public static void main(String[] args) {
            // creates a list of students for their class (classroom)
            // and adds students to that list
            List<Student> students = new ArrayList<>();
            Student s1 = new Student("A");
            students.add(s1);
            Student s2 = new Student("B");
            students.add(s2);

            // for loop that displays student names and day they registered
            for (Student s : students) {
                System.out.println(s.name + " registered at " + s.registrationDate);
            }


        }
    }
