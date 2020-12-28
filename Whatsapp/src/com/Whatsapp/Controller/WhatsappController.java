package com.Whatsapp.Controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;


import com.Whatsapp.Service.WhatsappService;
import com.Whatsapp.Service.WhatsappServiceInterface;
import com.Whatsapp.entity.WhatsappUser;
public class WhatsappController implements WhatsappControllerInterface {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void createProfile()throws Exception {
		System.out.println("enter your name");
		String name=br.readLine();
		
		System.out.println("enter your password");
		String password=br.readLine();
		
		System.out.println("enter your email");
		String email=br.readLine();
		
		System.out.println("enter your address");
		String address=br.readLine();
		WhatsappUser wu=new WhatsappUser();
		
	WhatsappServiceInterface fs=new WhatsappService();
	wu.setName(name);
	wu.setPassword(password);
	wu.setEmail(email);
	wu.setAddress(address);
	int i=fs.createProfileService(wu);
	
	if(i>0) {
		System.out.println("Registration Success");
	}
	else {
		System.out.println("could not register");
	}
	
	}
	
	public void viewProfile()throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name you want to view");
		String name=br.readLine();
		
		WhatsappUser iu=new WhatsappUser();
		iu.setName(name);
		WhatsappServiceInterface fs=new WhatsappService();
		WhatsappUser i=fs.viewProfileService(iu);
		if(i!=null)
			
		{
			System.out.println("Record Found ");
			System.out.println("Name is "+i.getName()+"  Password is "+i.getPassword());
		}
		else 
		{
			System.out.println("No Such User Found ");
		}
	}

	public void deleteProfile()throws Exception {
WhatsappServiceInterface fs=new WhatsappService();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the  name you want to delete ");
		String name=br.readLine();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		 int i=fs.deleteProfileService(wu);
		 if(i>0) {
				System.out.println("Deleted Successfully");
			}
			else {
				System.out.println("Could not Delete");
			}
	}

	public void editProfile()throws Exception {

		WhatsappServiceInterface fs=new WhatsappService();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the  name you want to edit ");
		String name=br.readLine();
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		System.out.println("enter the new Password ");
		String password=br.readLine();
		wu.setPassword(password);
		 int i=fs.editProfileService(wu);
		 if(i>0) {
				System.out.println("Updated Successfully");
			}
			else 
			{
				System.out.println("Could not Update");
			}
	}

	public void searchProfile() throws Exception{

	}

	public void viewAllProfile()throws Exception {

	}
}
