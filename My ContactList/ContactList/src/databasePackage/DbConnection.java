package databasePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DbConnection {
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby:TestDB;create=true");
//            ResultSet rs = con.createStatement().executeQuery("select *from st");
//            while (rs.next()) {                
//                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
//                    System.out.print(rs.getString(i)+" ");
//                }
//                System.out.println();
//            }
//            con.createStatement().execute("insert into st values(123,'mmm')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
