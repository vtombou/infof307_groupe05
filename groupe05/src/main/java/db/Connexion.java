package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion{

    private static Connection connect = null;

    //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
    public static Connection getInstance(){
        if(connect == null){
            try
            {
                // create a database connection
                connect = DriverManager.getConnection("jdbc:sqlite:./src/main/java/db/groupe05.db");
            }
            catch(SQLException e)
            {
                System.err.println(e.getMessage());
            }
        }
        return connect;
    }

}
