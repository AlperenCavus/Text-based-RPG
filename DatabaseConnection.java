package textBasedRPG;


import java.sql.*;


public class DatabaseConnection {
    
    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
    public static Connection main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/textbasedrpg","","");
            st=con.createStatement();
            return con;
        }catch(Exception ex) {
            System.out.println("Error: "+ex);
        }
    }

}
