package phastixtv.ch.database;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

    private static final String host = "localhost";
    private static final String port = "3306";
    private static final String database = "dev";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                        + resultSet.getInt(3));
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
