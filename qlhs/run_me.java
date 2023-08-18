package qlhs;
import java.util.Scanner;
public class run_me {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Nhap so thu tu tuong ung voi lua chon.");
            System.out.println("1. Hien thi thong tin sinh vien.");
            System.out.println("2. So luong sinh vien theo lop.");
            System.out.println("3. Diem tb cua sinh vien.");
            System.out.println("4. Cap nhat diem tb cua sinh vien.");
            System.out.println("5. Xoa sinh vien.");
            System.out.println("6. Sinh vien co diem trung binh cao nhat tung lop.");
            System.out.println("Nhap 0 de thoat chuong trinh.");

            choice=sc.nextInt();
            if(choice==1){
                System.out.print("Nhap MSSV: "); 
                int ID=sc.nextInt();
                sc.nextLine();
                connector a=new connector();
                a.getInfor(ID);
            }
            else if(choice==2){
                connector a = new connector();
                a.nos();
            }
            else if(choice==3){
                connector a = new connector();
                a.StudentsScore();
            }
        }while(choice==1||choice==2||choice==3||choice==4||choice==5||choice==6);
    }
}
