import java.util.Scanner;
public class Rectangle {
    float chieuDai, chieuRong;
    String ten;
    public Rectangle(String t){
        ten = t;
    }
    public void ten() {
        System.out.println("ten hinh chu nhat la: "+ ten);
    }
    public void infor(float cd, float cr){
        chieuDai=cd;
        chieuRong=cr;
        return;
    }
    public float dienTich(){
        System.out.println("dien tich hinh chu nhat la: " + chieuDai*chieuRong);
        return chieuDai*chieuRong;
    }
    public float chuVi(){
        System.out.println("chu vi hinh chu nhat la: " + 2*(chieuDai+chieuRong));
        return 2*(chieuDai+chieuRong);
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("nhap ten hinh chu nhat: ");
        String ten1 = input.nextLine();
        Rectangle hinh1 = new Rectangle(ten1);
        System.out.print("nhap chieu dai va chieu rong chu nhat: ");
        float cd=input.nextFloat(),cr=input.nextFloat();
        input.close();
        hinh1.infor(cd, cr);
        hinh1.ten();
        hinh1.dienTich();
        hinh1.chuVi();
    }
}
