package quan_ly_nhan_su;
import java.util.ArrayList;
import java.util.Scanner;
public class ListNhanSu {
    public ListNhanSu(){}
    static ArrayList<NhanSu> list = new ArrayList<>();
    public void run(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Ban muon lam gi?\n1.Them nhan su\n2.Xoa nhan su\n3.Danh sach nhan su\n4.Danh sach luong\n5.Danh sach chuc vu\nNhan 0 de thoat chuong trinh");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice==1){
                NhanSu n = new NhanSu();
                n.input();
                list.add(n);
                System.out.println("Da them nhan su "+ n.id +"\n");
            }
            else if(choice==2){
                System.out.print("Nhap ID nhan su can xoa: ");
                int ID=sc.nextInt();
                sc.nextLine();
                int i=0;
                for(;i<list.size();i++){
                    NhanSu n=list.get(i);
                    if(n.id==ID){
                        list.remove(i);
                        System.out.println("Da xoa nhan su "+ ID +"\n");
                        i=-1;
                        break;
                    } 
                }
                if(i!=-1){
                    System.out.println("Khong tim thay nhan su "+ID);
                }
            }
            else if(choice==3){
                System.out.println("ID - Ten - Tuoi - Chuc vu");
                for(NhanSu n:list){
                    n.dsns();
                }
            }
            else if(choice==4){
                System.out.println("ID - Ten - Chuc vu - Luong");
                for(NhanSu n:list){
                    n.dsl();
                }
            }
            else if(choice==5){
                System.out.println("ID - Ten - Chuc vu");
                for(NhanSu n:list){
                    n.dsr();
                }
            }
        }while(choice==1 || choice==2 || choice==3 || choice==4 || choice==5);
    }
}