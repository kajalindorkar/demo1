package com.Whatsapp.DAO;
import com.Whatsapp.entity.WhatsappUser;
public interface WhatsappDAOInterface {

	public int createProfileDAO(WhatsappUser wu)throws Exception;
	public WhatsappUser viewProfileDAO(WhatsappUser wu)throws Exception;

	public int deleteProfileDAO(WhatsappUser wu)throws Exception;
	public int  editProfileDAO(WhatsappUser wu)throws Exception;

	public void searchProfileDAO()throws Exception;

	public void viewAllProfileDAO()throws Exception;
}
