package EX2_TP1;
import java.util.ArrayList;
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new ArrayList<Course>();
    }
    public int getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void enroll(Course course) {
        courses.add(course);
    }

}
