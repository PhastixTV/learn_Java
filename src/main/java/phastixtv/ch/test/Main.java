package phastixtv.ch.test;

import phastixtv.ch.test.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static String uuid = "2c34168c-608c-4680-b5af-077b51c02005";
    private static int coinsToAdd = 100;

    public static void main(String[] args) throws ClassNotFoundException {
        MySQL.connect();

        // Schritt 1: Aktuellen Coins-Wert aus der Datenbank abrufen
        int currentCoins = getCurrentCoins(uuid);

        // Schritt 2: Coins hinzufügen
        int updatedCoins = currentCoins + coinsToAdd;

        // Schritt 3: Aktualisierte Coins in die Datenbank schreiben
        updateCoinsInDatabase(uuid, updatedCoins);

        MySQL.disconnect();
    }

    private static int getCurrentCoins(String playerUUID) {
        try {
            Statement statement = MySQL.getConnection().createStatement();
            String query = "SELECT Coins FROM `user-coins` WHERE `Player` = '" + playerUUID + "'";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                return resultSet.getInt("Coins");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0; // Falls kein Datensatz gefunden wurde
    }

    private static void updateCoinsInDatabase(String playerUUID, int newCoins) {
        try {
            Statement statement = MySQL.getConnection().createStatement();
            String query = "UPDATE `user-coins` SET `Coins` = " + newCoins + " WHERE `Player` = '" + playerUUID + "'";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
