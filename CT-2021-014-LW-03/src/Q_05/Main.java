package Q_05;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setCourseName("OOP");
        course1.setCourseCode("CTEC 001");

        Lecture lecture1 = new Lecture();
        lecture1.setLectureName("Kesevan");
        lecture1.setCourseTeaching("CTEC 001");

        Student student1 =  new Student();
        student1.setStudentName("Kushan");
        student1.setCourseFollowing("CTEC 001");
        student1.setDegreeName("BICT");

        System.out.println("Student Name: "+student1.getStudentName());
        System.out.println("Student CourseFollowing: "+student1.getCourseFollowing());
        System.out.println("Student DegreeName: "+student1.getDegreeName());
        System.out.println("Lecture Name: "+lecture1.getLectureName());
        System.out.println("lecture CourseTeaching: "+lecture1.getCourseTeaching());
        System.out.println("Course Name: "+course1.getCourseName());
        System.out.println("Course Code: "+course1.getCourseCode());
    }
}
