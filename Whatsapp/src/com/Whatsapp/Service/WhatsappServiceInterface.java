package com.Whatsapp.Service;
import com.Whatsapp.entity.WhatsappUser;
public interface WhatsappServiceInterface {
	public int createProfileService(WhatsappUser wu)throws Exception;
	public WhatsappUser viewProfileService(WhatsappUser wu)throws Exception;
	public int deleteProfileService(WhatsappUser wu)throws Exception ;
	public int editProfileService(WhatsappUser wu)throws Exception;
	public void searchProfileService()throws Exception;
	public void viewAllProfileService()throws Exception ;
	default void my()
	{
		
	}
	public static void my1()
	{
		
	}
}
