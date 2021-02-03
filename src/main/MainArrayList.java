package main;

import java.util.ArrayList;
import java.util.Scanner;

import clases.AppIoT;
import clases.AppMobile;
import clases.AppWeb;
import interfaces.AppMobileServiceImpl;
import interfaces.AppWebServiceImpl;

public class MainArrayList {

	public static void main(String[] args) {
		
		ArrayList<AppWeb> webs = new ArrayList<AppWeb>();
		ArrayList<AppMobile> mobile = new ArrayList<AppMobile>();
		ArrayList<AppIoT> iot = new ArrayList<AppIoT>();
		ArrayList<String>permision =new ArrayList <String>();
	    Scanner in = new Scanner(System.in);
	    
	    AppWeb web1 = new AppWeb();
	    AppWeb web2= new AppWeb();
	    
	    webs.add(web1);
	    webs.add(web2);
	    AppMobile permision1= new AppMobile();
	    AppMobile permision2= new AppMobile();
	    
	    mobile.add(permision1);
	    mobile.add(permision2);
	    AppIoT iot1 = new AppIoT();
	    AppIoT iot2 = new AppIoT();
	    
	    iot.add(iot1);
	    iot.add(iot2);
	    AppWebServiceImpl appWebService1 = new AppWebServiceImpl();
	    AppWebServiceImpl appWebService2 = new AppWebServiceImpl();
	    AppMobileServiceImpl appMobileService1 = new AppMobileServiceImpl();
	    AppMobileServiceImpl appMobileService2 = new AppMobileServiceImpl();
	    AppIoTServiceImpl appIOService1 = new AppIoTServiceImpl();
	    AppIoTServiceImpl appIOService2 = new AppIoTServiceImpl();
	    
		
		int tipoApp =0;
		
		
		System.out.println("Menu in the console");
	    System.out.println(
	    		System.out.println("Menu in the console");
	    	    System.out.println("1.- APP WEB");
	    	    System.out.println("2.- APP MOBILE");
	    	    System.out.println("3.- APP IOT");
	    		
	    		System.out.println("Choose the number of your App:");
	    		tipoApp = in.nextInt();
	    		
	    		switch(tipoApp) {
	    		case 1: System.out.println("Fill up the data 1st Object:");					
	    		
	    		webs.add = appWebService1.createApp();
	    		
	    		System.out.println("------------------ End 1st Object---------:");
	    		System.out.println("Fill up the data 2nd Object:");

	    		webs.add = appWebService2.createApp();
	    		System.out.println("------------------ End 2nd Object---------:");
	    		
	    		
	    
	    		break;
	    		case 2:System.out.println("Fill up the data 1st Object:");	
	    				mobile.add=appMobileService1.createApp();
	    				System.out.println("------------------ End 1st Object---------:");
	    				System.out.println("Fill up the data 2nd Object:");

	    				mobile.add = appMobileService2.createApp();
	    				System.out.println("------------------ End 2nd Object---------:");
	    				
	    			
	    				
	    
	    		break; 
	    		
	    		case 3:System.out.println("Fill up the data 1st Object:");	
	    		
	    		iot.add=appIOService1.createApp();
	    		System.out.println("------------------ End 1st Object---------:");
	    		System.out.println("Fill up the data 2nd Object:");
	    		//appWebService2.createApp();
	    		iot.add = appIOService2.createApp();
	    		System.out.println("------------------ End 2nd Object---------:");
	    			
	    		break;
	    		default: break; 
	    		
	    		}

	}

}
