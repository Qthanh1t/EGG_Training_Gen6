package qlhs;
import java.util.Scanner;
public class classes {
    public classes(){}
    private int classID;
    private String className;
    Scanner sc = new Scanner(System.in);
    public int getClassID() {
        return classID;
    }
    public void setClassID(int classID) {
        this.classID = classID;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void input(){
        System.out.print("Nhap ma lop: ");
        setClassID(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten lop: ");
        setClassName(sc.nextLine());
    }
}
