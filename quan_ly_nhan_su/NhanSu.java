package quan_ly_nhan_su;
import java.util.Scanner;
public class NhanSu {
    private String name,role;
    private int age,id;
    private double salary;
    public NhanSu(){}
    public void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setrole(String role){
        this.role=role;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id nhan su: ");
        setid(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten nhan su: ");
        setname(sc.nextLine());
        System.out.print("Nhap tuoi nhan su: ");
        setage(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap chuc vu nhan su: ");
        setrole(sc.nextLine());
        System.out.print("Nhap luong nhan su: ");
        setsalary(sc.nextDouble());
        sc.nextLine();
    }
    public void dsns(){
        System.out.print(id+" - ");
        System.out.print(name+" - ");
        System.out.print(age+" - ");
        System.out.println(role);
    }
    public void dsl(){
        System.out.print(id+" - ");
        System.out.print(name+" - ");
        System.out.print(role+" - ");
        System.out.println(salary);        
    }
    public void dsr(){
        System.out.print(id+" - ");
        System.out.print(name+" - ");
        System.out.println(role);
    }
}
