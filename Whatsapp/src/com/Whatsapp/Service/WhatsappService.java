package com.Whatsapp.Service;
import com.Whatsapp.entity.WhatsappUser;
import com.Whatsapp.DAO.WhatsappDAO;
import com.Whatsapp.DAO.WhatsappDAOInterface;
public class WhatsappService implements WhatsappServiceInterface{

	@Override
	public int createProfileService(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		WhatsappDAOInterface fd=new WhatsappDAO();
		int i=fd.createProfileDAO(wu);
		return i;
		
	}

	@Override
	public WhatsappUser viewProfileService(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		WhatsappDAOInterface fd=new WhatsappDAO(); 
		return fd.viewProfileDAO(wu);
	}

	@Override
	public int  deleteProfileService(WhatsappUser wu)throws Exception {
		// TODO Auto-generated method stub
		WhatsappDAOInterface fd=new WhatsappDAO();
		int i=fd.deleteProfileDAO(wu);
		return i;
	}

	@Override
	public int  editProfileService(WhatsappUser wu)throws Exception  {
		// TODO Auto-generated method stub
		WhatsappDAOInterface fd=new WhatsappDAO();
		int i=fd.editProfileDAO(wu);
		return i;
	}

	@Override
	public void searchProfileService()throws Exception  {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileService()throws Exception  {
		// TODO Auto-generated method stub
		
	}

}
