package tema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainCities {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/main_ads";
        String user = "root";
        String pass = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection done");

            // Insert
            
            String cityName = "New York";
            String countryCode = "US";
            int population = 8175133;
            String insertCityQuery = "insert into cities (name, country_code, population)"+" values('" + cityName + "', '" + countryCode + "', '" + population + "')";
            Statement s = conn.createStatement();
            s.executeUpdate(insertCityQuery);
            System.out.println("Inserted city");
            

            // Delete
            /*
            
            String deleteCityQuery = "delete from cities where name='Paris' " ;
            Statement s = conn.createStatement();
            s.executeUpdate(deleteCityQuery);
            System.out.println("Deleted city");
            */

            // Update
            /*
           String UpdateQuerry="update cities set population =95000 where name='New York' ";
			Statement s3=conn.createStatement();
			s3.executeUpdate(UpdateQuerry);*/

            // Read
            String readCityQuery = "select * from cities";
            Statement s1 = conn.createStatement();
            ResultSet rs = s1.executeQuery(readCityQuery);
            while (rs.next()) {
                System.out.println("City Name: " + rs.getString("name"));
                System.out.println("Country Code: " + rs.getString("country_code"));
                System.out.println("Population: " + rs.getInt("population"));
                
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
