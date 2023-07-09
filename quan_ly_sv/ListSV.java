package quan_ly_sv;
import java.util.Scanner;
public class ListSV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Nhap so thu tu tuong ung voi lua chon.");
            System.out.println("1. Them sinh vien.");
            System.out.println("2. Hien thi danh sach SV.");
            System.out.println("3. Cap nhat thong tin SV.");
            System.out.println("4. Xoa thong tin SV.");
            System.out.println("Nhap 0 de thoat chuong trinh.");

            choice=sc.nextInt();
            if(choice==1){
                Student s = new Student();
                s.input();
                jdbc a = new jdbc();
                a.Insert(s.getId(), s.getName(), s.getAge(), s.getMajor());
            }
            else if(choice==2){
                System.out.println("MSSV - ten - tuoi - chuyen nganh");
                jdbc a = new jdbc();
                a.Print();
                System.out.println("\n");
            }
            else if(choice==3){
                System.out.print("Nhap MSSV cua sinh vien muon cap nhat: ");
                int p_id=sc.nextInt();
                sc.nextLine();
                Student s=new Student();
                s.input();
                jdbc a=new jdbc();
                a.Update(p_id, s.getId(), s.getName(), s.getAge(), s.getMajor());
            }
            else if(choice==4){
                System.out.print("Nhap MSSV cua sinh vien muon xoa: ");
                int ID=sc.nextInt();
                sc.nextLine();
                jdbc a = new jdbc();
                a.Delete(ID);
            }
        }while(choice==1||choice==2||choice==3||choice==4);
    }
}
