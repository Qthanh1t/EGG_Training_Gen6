package qlhs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class connector {
    private static String DB_URL = "jdbc:mysql://localhost:3306/week_5-egg";
    private static String USER_NAME = "root";
    private static String PASSWORD = "thanh1234";
    public static Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public void getInfor(int StudentID){
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT `students`.`StudentID`,`students`.`StudentName`,`students`.`AverageScore`,`classes`.`ClassName`\n" + //
                    "FROM `week_5-egg`.`students`\n" + //
                    "JOIN `week_5-egg`.`classes`\n" + //
                    "ON `students`.`ClassID` =`classes`.`ClassID`\n" + //
                    "WHERE `students`.`StudentID`='"+StudentID+"';");
            rs.next();
            System.out.println("MSSV - Ten - DiemTB - LOP");
            System.out.println(rs.getInt(1) + " - " + rs.getString(2) 
                        + " - " + rs.getFloat(3) + " - " + rs.getString(4)+"\n");
            System.out.println("In thong tin thanh cong!!!"+"\n");           
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("In thong tin KHONG thanh cong!!!"+"\n");
        }
    }
    public void nos(){
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select classes.ClassName,count(students.StudentID)\n" + //
                    "from students\n" + //
                    "join classes\n" + //
                    "on students.ClassID=classes.ClassID\n" + //
                    "group by students.ClassID\n" + //
                    "order by count(students.StudentID) desc;");
            System.out.println("LOP - So Luong");
            while(rs.next()){
                System.out.println(rs.getString(1) + " - " + rs.getInt(2));
            }
            System.out.println("In thong tin thanh cong!!!"+"\n");         
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("In thong tin KHONG thanh cong!!!"+"\n");
        }
    }
    public void StudentsScore(){
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select *\n" + //
                    "from students\n" + //
                    "order by students.AverageScore desc;");
            System.out.println("MSSV - Ten - Ma Lop - Diem");
            while(rs.next()){
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) 
                        + " - " + rs.getInt(3) + " - " + rs.getFloat(4));
            }
            System.out.println("In thong tin thanh cong!!!"+"\n");         
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("In thong tin KHONG thanh cong!!!"+"\n");
        }
    }
    public void updateScore(int ID, float diem){
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();  
            stmt.executeUpdate("UPDATE `week_5-egg`.`students` SET `AverageScore`='"+diem+"' WHERE (`StudentID` = '"+ID+"');");
            System.out.println("Cap nhat diem sinh vien thanh cong!!\n");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Cap nhat thong tin sinh vien KHONG thanh cong!!\n");
        }    
    }
    public void deleteStudent(int ID){
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM `week_5-egg`.`students` WHERE (`StudentID` = '"+ID+"');");
            System.out.println("Xoa thong tin sinh vien thanh cong!!\n");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Xoa thong tin sinh vien KHONG thanh cong!!\n");
        }
    }
    public void maxEachClass(){
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select a.ClassName, students.StudentID, students.StudentName, students.AverageScore\n" + //
                    "from `week_5-egg`.`students`,(select classes.ClassID, classes.ClassName, MAX(students.AverageScore) as diem\n" + //
                    "from `week_5-egg`.`students`\n" + //
                    "join `week_5-egg`.`classes`\n" + //
                    "on students.ClassID=classes.ClassID\n" + //
                    "group by students.ClassID) a\n" + //
                    "where students.ClassID=a.ClassID and students.AverageScore=a.diem;\n" + //
                    "");
            System.out.println("Lop - MSSV - Ten - Diem");
            while(rs.next()){
                System.out.println(rs.getString(1) + " - " + rs.getInt(2) 
                        + " - " + rs.getString(3) + " - " + rs.getFloat(4));
            }
            System.out.println("In thong tin thanh cong!!!"+"\n");         
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("In thong tin KHONG thanh cong!!!"+"\n");
        }
    }
}
