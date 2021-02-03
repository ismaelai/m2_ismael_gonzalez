package main;

import java.util.Scanner;

import clases.AppIoT;
import clases.AppMobile;
import clases.AppWeb;
import interfaces.AppIotServiceImpl;

import interfaces.AppMobileServiceImpl;
import interfaces.AppWebServiceImpl;

public class MainArray {

	public static void main(String[] args) {
		AppWeb[] webs = new AppWeb[2];
	    AppMobile[] mobile = new AppMobile[2];	    
	    AppIoT[] iot = new AppIoT[2];
	    String[] permisos = {"camera","microphone","geolocalitation"};
	    Scanner in = new Scanner(System.in);
	    
	    AppWebServiceImpl appWebService1 = new AppWebServiceImpl();
	    AppWebServiceImpl appWebService2 = new AppWebServiceImpl();
	    AppMobileServiceImpl appMobileService1 = new AppMobileServiceImpl();
	    AppMobileServiceImpl appMobileService2 = new AppMobileServiceImpl();
	    AppIotServiceImpl appIOService1 = new AppIotServiceImpl();	    
	    AppIotServiceImpl appIOService2 = new AppIotServiceImpl();
	    
	    //Crear objetos
	    AppWeb web1 = new AppWeb("String progamminglang",
	    AppWeb web2 = new AppWeb("String progamminglang",false, 1, 4, 4, "String fronted","String backend");
	    AppMobile permision1 =new AppMobile();
	    AppMobile permision2 = new AppMobile();
	    AppIoT iot1 =new AppIoT("String progamminglang", true, 7, 4, 4, false, false,null);
	    AppIoT iot2 = new AppIoT("String progamminglang", true, 7, 4, 4, true, false,null);
	    
	    //Almacenar objetos en array
	    
	    permiso1.setPermisos(permisos);
	    permiso2.setPermisos(permisos)
	    
	    int tipoApp =0;
		
		
		System.out.println("Menu por consola");
	    System.out.println("1.- APP WEB");
	    System.out.println("2.- APP MOBILE");
	    System.out.println("3.- APP IO");
		
		System.out.println("Qué tipo de aplicación se quiere crear, Introduzca un número: ");
		tipoApp = in.nextInt();
		
		switch(tipoApp) {
		
		case 1: System.out.println("Rellene los datos del primer Objeto:");					
		
		webs[0] = appWebService1.createApp();
		
		System.out.println("------------------ Fin del 1 Objeto---------:");
		System.out.println("Rellene los datos del segundo Objeto:");

		webs[1] = appWebService2.createApp();
		System.out.println("------------------ Fin del 2 Objeto---------:");
		
		
		for(int i =0; i < webs.length;i++) {
			System.out.println("Array WEb posicion [" + i+ "]" + w
		}
		break;
		case 2:System.out.println("Rellene los datos del primer Objeto:");	
				mobile[0]=appMobileService1.createApp();
				System.out.println("------------------ Fin del 1 Objeto---------:");
				System.out.println("Rellene los datos del segundo Objeto:");

				mobile[1] = appMobileService2.createApp();
				System.out.println("------------------ Fin del 2 Objeto---------:");
				
			
				
				for(int i =0; i < webs.length;i++) {
					System.out.println("Array Mobile posicion [" + i + "]"+mobile[i]+"\n");
		
		}
		break; 
		
		case 3:System.out.println("Rellene los datos del primer Objeto:");	
		iot[0]=appIOService1.createApp();
		System.out.println("------------------ Fin del 1 Objeto---------:");
		System.out.println("Rellene los datos del segundo Objeto:");
		//appWebService2.createApp();
		iot[1] = appIOService2.createApp();
		System.out.println("------------------ Fin del 2 Objeto---------:");
		
		
		
		for(int i =0; i < webs.length;i++) {
			System.out.println("Array Iot posicion [" + i + "]"+iot[i]+"\n");
	}
		break;
		default: break; 
		
		}
	}
		
		
		
		