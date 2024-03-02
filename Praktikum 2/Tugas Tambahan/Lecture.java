/*Nama      : Raka Maulana Yusuf */
/*NIM       : 24060122140119 */
/*Deskripsi : file class java */
/*Nama file : Lecture.java */

import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void getDetails() {
        System.out.println("Nama            : " + name);
        System.out.println("Umur            : " + age);
        System.out.println("Alamat          : " + address);
        System.out.println("ID              : " + employeeID);
        System.out.println("");
    }    

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        System.out.println("Matakuliah yang diampu oleh " + name + ":");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
