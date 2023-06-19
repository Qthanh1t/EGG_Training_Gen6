package Bai_1;
import java.lang.Math;
import java.util.Scanner;
public class Triangle extends Shape{
    public Triangle(String name){
        super(name);
    }
    private double canh_1, canh_2, canh_3;
    public void setCanh(double canh_1, double canh_2, double canh_3){
        this.canh_1=canh_1;
        this.canh_2=canh_2;
        this.canh_3=canh_3; 
    }
    public double dienTich(){
        double p = (canh_1 + canh_2 + canh_3)/2;
        double dt = Math.sqrt(p*(p-canh_1)*(p-canh_2)*(p-canh_3));
        System.out.println("Dien tich hinh tam giac la: "+dt);
        return dt;
    }
    public double chuVi(){
        double cv = canh_1+canh_2+canh_3;
        System.out.println("Chu vi hinh tam giac la: "+cv);
        return cv;
    }
    public void printName(){
        System.out.println("Ten hinh tam giac la: "+super.getName());
        return;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hinh tam giac: ");
        String name = sc.nextLine();
        Triangle tam_giac_1 = new Triangle(name);
        System.out.print("Nhap 3 canh cua tam giac: ");
        double canh_1=sc.nextDouble(), canh_2=sc.nextDouble(), canh_3=sc.nextDouble();
        tam_giac_1.setCanh(canh_1, canh_2, canh_3);
        tam_giac_1.printName();
        tam_giac_1.chuVi();
        tam_giac_1.dienTich();
    }
}