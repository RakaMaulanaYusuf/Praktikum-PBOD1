/*Nama      : Raka Maulana Yusuf */
/*NIM       : 24060122140119 */
/*Deskripsi : file main java */
/*Nama file : Main.java */

public class Main {
    public static void main(String[] args) {
        
        Student s1,s2, s3;
        Course matkul1, matkul2, matkul3;
        Lecture dosen1, dosen2;
  
        s1 = new Student("Raka Maulana Yusuf", 19, "Kudus, Jateng", 240601221);
        s2 = new Student("Vestia Zeta", 20, "Kudus, Jateng", 240601211);
        s3 = new Student("Megumi Kato", 16, "Tokyo, Japan", 240601221);
  
        dosen1 = new Lecture("Nico Robin", 30, "Ohara, West Blue", 45);
        dosen2 = new Lecture("Asuna Yuuki", 29, "Log House, Aincrad", 46);
        
  
        matkul1 = new Course("PAIK1", "Pemrograman Berorientasi Objek",dosen2);
        matkul2 = new Course("PAIK2", "Olahraga", dosen1);
        matkul3 = new Course("PAIK3", "Algoritma Pemrograman", dosen2);
  
        dosen2.teachCourse(matkul1);
        dosen1.teachCourse(matkul2);
        dosen2.teachCourse(matkul3);  
  
        s1.getDetails();
        s2.getDetails();
        s3.getDetails();
  
        matkul1.addStudent(s2);
        matkul1.addStudent(s3);
        matkul1.addStudent(s1);
        matkul2.addStudent(s1);
        matkul2.addStudent(s3);
        matkul3.addStudent(s1);
        matkul3.addStudent(s2);
  
        s1.enrollInCourse(matkul1);
        s1.enrollInCourse(matkul3);
        s1.enrollInCourse(matkul2);
        s2.enrollInCourse(matkul1);
        s2.enrollInCourse(matkul3);
        s3.enrollInCourse(matkul1);
        s3.enrollInCourse(matkul2);
  
  
        s1.viewEnrolledCourses();
        s2.viewEnrolledCourses();
        s3.viewEnrolledCourses();
  
        dosen1.getDetails();
        dosen2.getDetails();
  
        dosen1.viewTaughtCourses();
        dosen2.viewTaughtCourses();
  
        matkul1.viewEnrolledStudents();
        matkul2.viewEnrolledStudents();
        matkul3.viewEnrolledStudents();
    }
  }
  