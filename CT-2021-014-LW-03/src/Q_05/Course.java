package Q_05;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecture lecture= new Lecture();

    public void lecture(String courseName, String courseCode){
        this.courseCode=courseCode;
        this.courseName=courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
