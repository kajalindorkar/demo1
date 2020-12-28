package com.Whatsapp.Controller;
import com.Whatsapp.entity.WhatsappUser;
public interface WhatsappControllerInterface {
	public void createProfile()throws Exception;
	public void viewProfile()throws Exception;
	public void deleteProfile() throws Exception;
	public void editProfile()throws Exception;
	public void searchProfile()throws Exception;
	public void viewAllProfile() throws Exception;
	default void my()
	{
		
	}
	public static void my1()
	{
		
	}

}
