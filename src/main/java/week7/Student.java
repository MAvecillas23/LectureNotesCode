package week7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Student {
    // students class that holds student name and the date they enrolled in their class (classroom)

    String name; // student name field
    Date registrationDate; // date they enrolled

    // constructor
    public Student(String name) {
        this.name = name;
        this.registrationDate = new Date();

    }
}

