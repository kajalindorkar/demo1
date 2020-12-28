package com.Whatsapp.view;
import com.Whatsapp.Controller.WhatsappController;
import com.Whatsapp.Controller.WhatsappControllerInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class WhatsappView {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String ss="y";
		while(ss.contentEquals("y")) {
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view All profile");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter your choice");
		String str=br.readLine();
		int i=Integer.parseInt(str);
		WhatsappControllerInterface w=new WhatsappController();
		switch(i) {
		case 1: w.createProfile();
			break;
		case 2:w.viewProfile();
			break;
		case 3:w.deleteProfile();
			break;
		case 4:w.editProfile();
			break;
		case 5:w.searchProfile();
			break;
		case 6:w.viewAllProfile();
			break;
		default:System.out.println("wrong choice");
		}

		System.out.println("do you want to continue press y/n");
		ss=br.readLine();
		}
		
	}

}
