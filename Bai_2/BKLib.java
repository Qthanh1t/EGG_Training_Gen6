package Bai_2;

public abstract class BKLib {
    public BKLib(){}
    private String maSach, tieuDe, nxb;
    public class ngay_nhap{
        int ngay, thang, nam;
        public ngay_nhap(int ngay, int thang, int nam){
            this.ngay=ngay;
            this.thang=thang;
            this.nam=nam;
        }
        public ngay_nhap(){}
    }
    private ngay_nhap ngayNhap = new ngay_nhap(); 
    private double donGia;
    private int soLuong;
    
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public void setNgayNhap(int ngay, int thang, int nam) {
        this.ngayNhap.ngay = ngay;
        this.ngayNhap.thang = thang;
        this.ngayNhap.nam = nam;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public String getMaSach() {
        return maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getNxb() {
        return nxb;
    }

    public ngay_nhap getNgayNhap() {
        return ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public abstract double thanhTien();
}