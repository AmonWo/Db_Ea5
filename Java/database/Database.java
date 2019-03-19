package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    public static void main (String[] args) throws Exception{
        createTable();
    }

    private static Connection createTable() throws Exception {
        Statement stmt = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://slo.swe.fh-luebeck.de:3306";
        String username = "GruppeI";
        String password = "@Fkoj6hdtQ52";
        Connection con = DriverManager.getConnection(url, username, password);

        try {
            Class.forName(driver);
            System.out.println("Connection established");
            stmt = con.createStatement();
            String sql = "CREATE TABLE CUSTOMER" +
                    "(id INTEGER not NULL, " +
                    "firstname VARCHAR(255), " +
                    "lastname VARCHAR(255), " +
                    "street VARCHAR(255), " +
                    "housenumber INTEGER, " +
                    "city VARCHAR (255), " +
                    "postcode INTEGER, " +
                    "phone INTEGER, " +
                    "mail VARCHAR(255)" +
                    "PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in give database...");

           con.close();

           return con;

        } catch (SQLException se) {
            System.out.println(se + "\nSQL Exception");
        } catch (Exception e) {
            System.out.println(e + "\nConnection failed");
        } finally {
            if(stmt!=null)
                con.close();
        }
        return null;
    }
}
