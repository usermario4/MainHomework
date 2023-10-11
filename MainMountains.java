package tema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainMountains {

	public static void main(String[] args)throws SQLException {
		String url="jdbc:mysql://localhost:3306/main_ads";
		String user="root";
		String pass="";
		try {
			
			Connection conn=DriverManager.getConnection(url, user,pass);
			System.out.println("Connection done");
			
			/*String Name="Pietrosul Rodnei";
			int Nr=1;
			String Height="2303m";
			String insertMountainQuerry="insert into mountains(Name,Nr,Height)"+"values('"+Name+"','"+Nr+"','"+Height+"')";
			
			Statement s=conn.createStatement();
			s.executeUpdate(insertMountainQuerry);
			System.out.println("inserted mountain");*/
			
			//delete
			/*
			String DeleteQuerry="delete from mountains where nr=2";
			Statement s=conn.createStatement();
			s.executeUpdate(DeleteQuerry);*/
			
			
				//update
				String UpdateQuerry="update mountains set height='2604m' where Name='Pietrosul Rodnei'";
				Statement s2=conn.createStatement();
				s2.executeUpdate(UpdateQuerry);
				
				//read
				String ReadQuerry=" select * from mountains";
				Statement s1=conn.createStatement();
				ResultSet rs=s1.executeQuery(ReadQuerry);
				while(rs.next()) {
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("height"));	
					
			}
			
			
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}

	}

}
