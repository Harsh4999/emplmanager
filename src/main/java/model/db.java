package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class db {
	public static void insert(employee obj){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/harsh","root","password");  
			String sql = "insert into empl values(?,?,?,?,?);";
			System.out.println(obj.empid+" "+obj.firstName+" "+obj.lastName);
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setLong(1, obj.getEmpid());
			stmt.setString(2, obj.getFirstName());
			stmt.setString(3,obj.getLastName());
			stmt.setInt(4,obj.getSalary());
			stmt.setString(5, obj.getDesignation());
			stmt.execute();
			stmt.close();
			con.close();  
			System.out.println("inserted 1 record");
		}catch(Exception e){ 
			System.out.println(e);
		}  
		 
	}
	public static void update(employee obj) {
//		try{  
//			Class.forName("com.mysql.jdbc.Driver");  
//			Connection con=DriverManager.getConnection(  
//			"jdbc:mysql://localhost:3306/harsh","root","");  
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM empl WHERE empid="+obj.empid);
//			int c=0;
//			while(rs.next()) {
//				c++;
//			}
//			if(c>0) {
//				String sql = "update empl SET firstName="+obj.firstName+",lastName="+obj.lastName+"WHERE firstName="+obj.firstName;
//				Statement s = con.createStatement();
//				s.execute(sql);
//				System.out.println("updated 1 record");
//			}
//			
//			con.close();  
//			
//		}catch(Exception e){ 
//			System.out.println(e);
//		}
	}
}
