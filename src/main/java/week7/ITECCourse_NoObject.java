package week7;

import java.util.ArrayList;

public class ITECCourse_NoObject {
    public static void main(String[] args) {

        // this program uses ITECCourse class to create objects to add class names, code and max students allowed
        // to enroll. This object is can also add students, remove students, and print out all available information

        // creating new ITECCourse object with course name, code and max students as the variables
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310,
                20);

        //Add some students.
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.removeStudent("Carl"); // removes student name from list that exists
        maintenanceCourse.removeStudent("Martha"); // removes student that doesnt exists... tells user
                                                                // user doesn't exist

        maintenanceCourse.writeCourseInfo(); // displays course information

        // same explanation as the comments above
        // new object
        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);


        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

      datacomCourse.writeCourseInfo(); // displays course information

        // new object
      ITECCourse softwareDevelopment = new ITECCourse("Software Development Projects", 2903,
              24);

      // add students
      softwareDevelopment.addStudent("Gus");
      softwareDevelopment.addStudent("Harry");
      softwareDevelopment.addStudent("Izzy");

      softwareDevelopment.writeCourseInfo(); // displays information

    // new object... notice max students allowed to enroll is 3
      ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);

      // add students... unable to add fourth students because maxStudents is full
      smallCourse.addStudent("Kirby");
      smallCourse.addStudent("Liam");
      smallCourse.addStudent("Miriam");
      smallCourse.addStudent("Nita"); //

      smallCourse.writeCourseInfo(); // displays list of the first 3 students enrolled... class list is at capacity
    }


}
