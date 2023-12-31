package EX2_TP1;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(1, "John", "Doe");
        Instructor instructor2 = new Instructor(2, "Jane", "Doe");
        Course course1 = new Course(1, "Java", instructor1);
        Course course2 = new Course(2, "C++", instructor2);
        Student student1 = new Student(1, "John", "Doe");
        Student student2 = new Student(2, "Jane", "Doe");
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);
        student2.enroll(course2);
        System.out.println("Student 1:");
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("First Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Courses:");
        for (Course course : student1.getCourses()) {
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Instructor ID: " + course.getInstructor().getInstructorId());
            System.out.println("Instructor First Name: " + course.getInstructor().getFirstName());
            System.out.println("Instructor Last Name: " + course.getInstructor().getLastName());
        }
        System.out.println("Student 2:");
        System.out.println("Student ID: " + student2.getStudentId());
        System.out.println("First Name: " + student2.getFirstName());
        System.out.println("Last Name: " + student2.getLastName());
        System.out.println("Courses:");
        for (Course course : student2.getCourses()) {
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Instructor ID: " + course.getInstructor().getInstructorId());
            System.out.println("Instructor First Name: " + course.getInstructor().getFirstName());
            System.out.println("Instructor Last Name: " + course.getInstructor().getLastName());
        }
    }
}
