package tema;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MainAds {

	public static void main(String[] args)throws SQLException {
		String url="jdbc:mysql://localhost:3306/main_ads";
		String user="root";
		String pass="";
		try {
			
			Connection conn=DriverManager.getConnection(url, user,pass);
			System.out.println("Connection done");
			//facem /inseram o entitate in baza de date
			/*String title="proTv";
			int amount=200;
			Date published_at=new Date(System.currentTimeMillis());
			
			String insertEventQuerry="insert into ads(title,amount,published_at)"+"values('"+title+"','"+amount+"','"+published_at+"')";
			
			Statement s=conn.createStatement();
			s.executeUpdate(insertEventQuerry);
			System.out.println("inserted ad");*/
			
			//am inserat una manual in sql pentru urmatoarea operatie
			
			//delete
			/*String deleteQuery="delete from ads where amount=200";
			Statement s1=conn.createStatement();
			s1.executeUpdate(deleteQuery);*/
			
			//read
			
			/*String readAllQuerry="select * from ads";
			Statement s2=conn.createStatement();
			ResultSet rs=s2.executeQuery(readAllQuerry);
			while(rs.next()) {
				System.out.println(rs.getString("title"));
				System.out.println(rs.getString("amount"));	
			}*/
			
			//update
			String UpdateQuerry="update ads set title ='nike_ads' where title='Ariel' ";
			Statement s3=conn.createStatement();
			s3.executeUpdate(UpdateQuerry);
			
			
			
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		System.out.println("Finish");
		

	}

}
