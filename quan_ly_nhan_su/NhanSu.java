package quan_ly_nhan_su;
import java.util.Scanner;
public class NhanSu {
    String name,role;
    int age,id;
    double salary;
    public NhanSu(){}
    public void getid(int id){
        this.id=id;
    }
    public void getname(String name){
        this.name=name;
    }
    public void getrole(String role){
        this.role=role;
    }
    public void getage(int age){
        this.age=age;
    }
    public void getsalary(double salary){
        this.salary=salary;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id nhan su: ");
        getid(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten nhan su: ");
        getname(sc.nextLine());
        System.out.print("Nhap tuoi nhan su: ");
        getage(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap chuc vu nhan su: ");
        getrole(sc.nextLine());
        System.out.print("Nhap luong nhan su: ");
        getsalary(sc.nextDouble());
        sc.nextLine();
    }
    public void dsns(){
        System.out.print(id+" - ");
        System.out.print(name+" - ");
        System.out.print(age+" - ");
        System.out.println(role+"\n");
    }
    public void dsl(){
        System.out.print(id+" - ");
        System.out.print(name+" - ");
        System.out.print(role+" - ");
        System.out.println(salary+"\n");        
    }
    public void dsr(){
        System.out.print(id+" - ");
        System.out.print(name+" - ");
        System.out.println(role+"\n");
    }
}
