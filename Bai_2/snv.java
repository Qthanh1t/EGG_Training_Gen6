package Bai_2;
import java.util.Scanner;
public class snv extends BKLib {
    private String ngonNgu;
    public snv(){}
    public String getNgonNgu() {
        return ngonNgu;
    }
    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }
    public double thanhTien(){
        double thanhTien=getDonGia()*getSoLuong()*1.2;
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
        System.out.print("Nhap nha ngon ngu cua sach: ");
        setNgonNgu(sc.nextLine());
    }
    public void output(){
        System.out.print(getMaSach()+" - ");
        System.out.print(getTieuDe()+" - ");
        System.out.print(getNgayNhap().ngay+"/"+getNgayNhap().thang+"/"+getNgayNhap().nam+" - ");
        System.out.println(getNxb());
    }
}
