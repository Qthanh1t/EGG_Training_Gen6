package Bai_2;
import java.util.Scanner;
public class sgk extends BKLib{
    private String tinhTrang;
    public sgk(){}
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public double thanhTien(){
        double thanhTien;
        if(tinhTrang.equalsIgnoreCase("moi")){
            thanhTien=getSoLuong()*getDonGia();
        }
        else thanhTien=getSoLuong()*getDonGia()*0.5;
        return thanhTien;
    }
    Scanner sc = new Scanner(System.in);
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
        System.out.print("Nhap tinh trang sach (moi/cu): ");
        setTinhTrang(sc.nextLine());
    }
    public void output(){
        System.out.print(getMaSach()+" - ");
        System.out.print(getTieuDe()+" - ");
        System.out.print(getNgayNhap().ngay+"/"+getNgayNhap().thang+"/"+getNgayNhap().nam+" - ");
        System.out.println(getNxb());
    }
}

