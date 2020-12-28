package com.Whatsapp.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Whatsapp.entity.WhatsappUser;
public class WhatsappDAO implements WhatsappDAOInterface{

	@Override
	public int createProfileDAO(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		int i=0;
		//Step 1 load driver
        Class.forName("org.postgresql.Driver");
       
        //step 2 connect with database
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/facebook","postgres","Exitnov");
       
        //step 3 create query
        //Statement for static query
        //PreparedStatement for dynamic query
        PreparedStatement ps=con.prepareStatement("insert into fbapplication values(?,?,?,?)");
        ps.setString(1, wu.getName());
      
        ps.setString(2, wu.getPassword());
        ps.setString(3, wu.getEmail());
        ps.setString(4, wu.getAddress());
       
        //step 4 execute query
        //for insert, delete, update use executeUpdate() and return type will be int
        //for select use executeQuery() and return ResultSet
       
        i=ps.executeUpdate();
		return i;
		
	}

	@Override
	public WhatsappUser viewProfileDAO(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		 Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/facebook","postgres","Exitnov");
		 PreparedStatement ps=con.prepareStatement("select * from fbapplication where name =?");
		 ps.setString(1,wu.getName());
		 ResultSet res=ps.executeQuery();
	       
		 WhatsappUser fb=null;
	       
	        if(res.next()) {
	            fb=new WhatsappUser();
	            fb.setName(res.getString(1));
	            fb.setPassword(res.getString(2));
	            fb.setEmail(res.getString(3));
	            fb.setAddress(res.getString(4));
	        }
	        return fb;
		
	}

	@Override
	public int  deleteProfileDAO(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		int i=0;
		 Class.forName("org.postgresql.Driver");
		 Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/facebook","postgres","Exitnov");
		 PreparedStatement ps=con.prepareStatement("delete from fbapplication where name =?");
		 ps.setString(1,wu.getName());
		   i=ps.executeUpdate();
			return i;
			
		
	}

	@Override
	public int editProfileDAO(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		int i=0;
		 Class.forName("org.postgresql.Driver");
		 Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/facebook","postgres","Exitnov");
		 PreparedStatement ps=con.prepareStatement("update fbapplication set password='"+wu.getPassword()+"' where name =?");
		 
		 ps.setString(1, wu.getName());
	       // ps.setString(2,fu.getPassword());
	      
	       
		      
		 i=ps.executeUpdate();
			return i;
		
	}

	@Override
	public void searchProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
