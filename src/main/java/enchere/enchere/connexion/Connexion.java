/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchere.enchere.connexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    private Connection connection;

    public Connexion() {
    }

    public Connection getconnect(String dbname, String utilisateur, String mdp) {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://containers-us-west-157.railway.app:6797/" + dbname,
                    utilisateur, mdp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection() {
        Connexion c = new Connexion();
        Connection connect = c.getconnect("railway", "postgres", "s44VhxaI0Zw80QBy62uW");
        return connect;
    }
}
