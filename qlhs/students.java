package qlhs;
import java.util.Scanner;
public class students {
    private int StudentID, ClassID;
    private String StudentName;
    private float AverageScore;
    public students(){}
    Scanner sc = new Scanner(System.in);
    public int getStudentID() {
        return StudentID;
    }
    public void setStudentID(int studentID) {
        StudentID = studentID;
    }
    public int getClassID() {
        return ClassID;
    }
    public void setClassID(int classID) {
        ClassID = classID;
    }
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public float getAverageScore() {
        return AverageScore;
    }
    public void setAverageScore(float averageScore) {
        AverageScore = averageScore;
    }
    public void input(){
        System.out.print("Nhap MSSV: ");
        setStudentID(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten SV: ");
        setStudentName(sc.nextLine());
        System.out.print("Nhap ma lop: ");
        setClassID(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        setAverageScore(sc.nextFloat());
        sc.nextLine();
    }
}
