package Bai_2;
import java.util.Scanner;
public class stk extends BKLib{
    private String chuyenNganh;
    private double thue;
    public stk(){}
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public void setThue(double thue) {
        this.thue = thue;
    }
    public String getChuyenNganh() {
        return chuyenNganh;
    }
    public double getThue() {
        return thue;
    }
    public double thanhTien(){
        double thanhTien=getDonGia()*getSoLuong()+thue;
        return thanhTien;
    }
    Scanner sc=new Scanner(System.in);
    public void input(){
        System.out.print("Nhap ma sach: ");
        setMaSach(sc.nextLine());
        System.out.print("Nhap tieu de sach: ");
        setTieuDe(sc.nextLine());
        System.out.print("Nhap ngay nhap sach (ngay thang nam): ");
        setNgayNhap(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap nha xuat ban sach: ");
        setNxb(sc.nextLine());
        System.out.print("Nhap don gia: ");
        setDonGia(sc.nextDouble());
        System.out.print("Nhap so luong: ");
        setSoLuong(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        setChuyenNganh(sc.nextLine());
        System.out.print("Nhap thue: ");
        setThue(sc.nextDouble());
        sc.nextLine();
    }
    public void output(){
        System.out.print(getMaSach()+" - ");
        System.out.print(getTieuDe()+" - ");
        System.out.print(getNgayNhap().ngay+"/"+getNgayNhap().thang+"/"+getNgayNhap().nam+" - ");
        System.out.println(getNxb());
    }
}
