package quan_ly_sv;
import java.util.Scanner;
public class Student {
    public Student(){}
    private int id,age;
    private String name,major;
    Scanner sc=new Scanner(System.in);
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void input(){
        System.out.print("Nhap MSSV: ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten SV: ");
        setName(sc.nextLine());
        System.out.print("Nhap tuoi SV: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap chuyen nganh SV: ");
        setMajor(sc.nextLine());        
    }    
}
