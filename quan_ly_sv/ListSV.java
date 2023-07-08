package quan_ly_sv;
import java.util.Scanner;
import java.util.ArrayList;
public class ListSV {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
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
                list.add(s);
                System.out.println("Da them sinh vien "+s.getId()+"\n");
            }
            else if(choice==2){
                System.out.println("MSSV - ten - tuoi - chuyen nganh");
                for(Student s:list){
                    s.output();
                }
                System.out.println("\n");
            }
            else if(choice==3){
                System.out.print("Nhap MSSV cua sinh vien muon cap nhat: ");
                int ID=sc.nextInt();
                sc.nextLine();
                int i=0;
                boolean a=false;
                for(;i<list.size();i++){
                    Student s=list.get(i);
                    if(s.getId()==ID){
                        a=true;
                        break;
                    }
                }
                if(a){
                    System.out.println("Cap nhat thong tin");
                    Student s=list.get(i);
                    s.input();
                    System.out.println("Da cap nhat thong tin sinh vien "+s.getId()+"\n");
                }
                else{
                    System.out.println("Khong tim thay sinh vien "+ID+"\n");
                }
            }
            else if(choice==4){
                System.out.print("Nhap MSSV cua sinh vien muon xoa: ");
                int ID=sc.nextInt();
                sc.nextLine();
                int i=0;
                for(;i<list.size();i++){
                    Student s=list.get(i);
                    if(s.getId()==ID){
                        list.remove(i);
                        i=-1;
                        System.out.println("Da xoa sinh vien "+ID+"\n");
                        break;
                    }
                }
                if(i>=0) System.out.println("Khong tim thay sinh vien "+ID+"\n");
            }
        }while(choice==1||choice==2||choice==3||choice==4);
    }
}
