package quan_ly_sv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class jdbc {
    private static String DB_URL = "jdbc:mysql://localhost:3306/student_management";
    private static String USER_NAME = "root";
    private static String PASSWORD = "thanh1234";
    public static Connection getConnection(String dbURL, String userName, 
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public void Print() {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student_management.students;");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) 
                        + " - " + rs.getString(3) + " - " + rs.getString(4));
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("In danh sach KHONG thanh cong!!!"+"\n");
        }
    }
    public void Insert(int id, String name, int age, String major){
    try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO `student_management`.`students` (`id`, `name`, `age`, `major`) VALUES ('" +id+"', '"+name+"', '"+age+"', '"+major+"');");
            System.out.println("Da them sinh vien "+id+"\n");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Them sinh vien KHONG thanh cong!!\n");
        }   
    }
    public void Update(int p_id, int n_id, String name, int age, String major){
    try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();  
            stmt.executeUpdate("UPDATE `student_management`.`students` SET `id` = '"+n_id+"',`name` ='"+name+"', `age` = '"+age+"', `major` = '"+major+"' WHERE (`id` = '"+p_id+"');");
            System.out.println("Cap nhat thong tin sinh vien thanh cong!!\n");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Cap nhat thong tin sinh vien KHONG thanh cong!!\n");
        }    
    }
    public void Delete(int id){
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM `student_management`.`students` WHERE (`id` = '"+id+"');");
            System.out.println("Xoa thong tin sinh vien thanh cong!!\n");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Xoa thong tin sinh vien KHONG thanh cong!!\n");
        } 
    }

}