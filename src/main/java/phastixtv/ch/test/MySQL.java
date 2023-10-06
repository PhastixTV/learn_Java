package phastixtv.ch.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL {

    private static final String host = "localhost";
    private static final String port = "3306";
    private static final String database = "mysql-test";
    private static final String username = "root";
    private static final String password = "";

    private static Connection con;

    public static boolean isConnected() {
        return (con == null ? false : true);
    }

    public static void connect() throws ClassNotFoundException{
        if (!isConnected()) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
                System.out.println("[MySQL] Verbunden!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void disconnect() {
        if (isConnected()) {
            try {
                con.close();
                System.out.println("[MySQL] Verbindung getrennt!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void update(String qry) {
        try {
            PreparedStatement ps = con.prepareStatement(qry);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return con;
    }
}