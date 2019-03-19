package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://slo.swe.fh-luebeck.de:3306/GruppeI";
    private String username = "GruppeI";
    private String password = "@Fkoj6hdtQ52";

    public static void main (String[] args) throws Exception{
        createTable();
    }

    private static Connection getConnection() throws Exception{
        Database data = new Database();
        return  DriverManager.getConnection(data.url, data.username, data.password);;
    }

    private static void createTable() throws Exception {
        Connection con = getConnection();
        Statement stmt = null;
        Database data = new Database();
        try {
            Class.forName(data.driver);
            System.out.println("Connection established");
            String sql = "CREATE TABLE CUSTOMER_EA5 " +
                    "(id INTEGER not NULL, " +
                    " firstname VARCHAR(255), " +
                    " lastname VARCHAR(255), " +
                    " street VARCHAR(255), " +
                    " housenumber INTEGER, " +
                    " city VARCHAR (255), " +
                    " postcode INTEGER, " +
                    " phone INTEGER, " +
                    " mail VARCHAR(255), " +
                    " PRIMARY KEY (id))";
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Created table in give database...");

           con.close();

        } catch (SQLException se) {
            System.out.println(se + "\nSQL Exception");
        } catch (Exception e) {
            System.out.println(e + "\nConnection failed");
        } finally {
            if(stmt!=null)
                con.close();
        }
    }

    private static Connection addToDB() throws Exception{
        Database data = new Database();

        try {

        }catch(SQLException se){

        }catch(Exception e){

        }finally {

        }

    }
}
