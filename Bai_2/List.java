package Bai_2;
import java.util.ArrayList;
import java.util.Scanner;
public class List {
    public static void main(String [] args){
        ArrayList<sgk> listSgk = new ArrayList<>();
        ArrayList<stk> listStk = new ArrayList<>();
        ArrayList<snv> listSnv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Ban muon lam gi?");
            System.out.println("1. Them sach");
            System.out.println("2. Xem danh sach cac loai sach");
            System.out.println("3. Tong thanh tien");
            System.out.println("Nhap 0 de thoat chuong trinh");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.print("Nhap loai sach muon them (sgk/stk/snv): ");
                String loai;
                int k=1;
                do{ k=1;
                    loai=sc.nextLine();
                    if(loai.equalsIgnoreCase("sgk")){
                        sgk Sgk = new sgk();
                        Sgk.input();
                        listSgk.add(Sgk);   
                    }
                    else if(loai.equalsIgnoreCase("stk")){
                        stk Stk = new stk();
                        Stk.input();
                        listStk.add(Stk);
                    }
                    else if(loai.equalsIgnoreCase("snv")){
                        snv Snv = new snv();
                        Snv.input();
                        listSnv.add(Snv);
                    }
                    else {
                        System.out.print("Nhap sai loai sach!!\nNhap lai loai sach muon them (sgk/stk/snv): ");
                        k=0;
                    }
                }while(k==0);   
            }
            else if(choice==2){
                String loai;
                int k=1;
                System.out.print("Nhap loai sach muon xem danh sach (sgk/stk/snv): ");
                do{ k=1;
                    loai=sc.nextLine();
                    System.out.println("Ma Sach - Tieu De - Ngay Nhap - NXB");
                    if(loai.equalsIgnoreCase("sgk")){
                        for(sgk n:listSgk){
                            n.output();
                        }
                        System.out.println("");
                    }
                    else if(loai.equalsIgnoreCase("stk")){
                        for(stk n:listStk){
                            n.output();
                        }
                        System.out.println("");
                    }
                    else if(loai.equalsIgnoreCase("snv")){
                        for(snv n:listSnv){
                            n.output();
                        }
                        System.out.println("");
                    }
                    else{
                        System.out.print("Nhap sai loai sach!!\nNhap lai loai sach muon xem danh sach (sgk/stk/snv): ");
                        k=0;
                    } 
                }while(k==0);
            }
            else if(choice==3){
                String loai;
                int k=1;
                System.out.print("Nhap loai sach muon tinh tong thanh tien (sgk/stk/snv): ");
                do{ k=1;
                    loai=sc.nextLine();
                    if(loai.equalsIgnoreCase("sgk")){
                        double tong=0;
                        for(sgk n:listSgk){
                            tong+=n.thanhTien();
                        }
                        System.out.println("Tong thanh tien cua sgk la: "+tong);
                    }
                    else if(loai.equalsIgnoreCase("stk")){
                        double tong=0;
                        for(stk n:listStk){
                            tong+=n.thanhTien();
                        }
                        System.out.println("Tong thanh tien cua stk la: "+tong);
                    }
                    else if(loai.equalsIgnoreCase("snv")){
                        double tong=0;
                        for(snv n:listSnv){
                            tong+=n.thanhTien();
                        }
                        System.out.println("Tong thanh tien cua snv la: "+tong);
                    }
                    else{
                        System.out.print("Nhap sai loai sach!!\nNhap lai loai sach muon them (sgk/stk/snv): ");
                        k=0;
                    }
                }while(k==0);
            }
        }while(choice==1||choice==2||choice==3);
    }

}
