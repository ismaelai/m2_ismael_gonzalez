package main;

import clases.AppIoT;
import clases.AppMobile;
import clases.AppWeb;
import interfaces.AppIotServiceImpl;
import interfaces.AppMobileServiceImpl;
import interfaces.AppWebServiceImpl;

public class Main {

	public static void main(String[] args) {
	 
		// 1 crear objeto de la class appwebserviceImpl
		AppWebServiceImpl webService = new AppWebServiceImpl();
		
		// 2 usar metodo createApp
		AppWeb web = webService.createApp();
		// 1.2 imprimir objeto por consola
		System.out.print(web.toString());
		
		// 1 crear objeto de la class appmobileserviceImpl
		AppMobileServiceImpl mobileService = new AppMobileServiceImpl();
		
		AppMobile mobile = mobileService.createApp();
		
		System.out.println(mobile.toString());
		
		// 1 crear objeto de la class appIoTserviceImpl
		AppIotServiceImpl iotService = new AppIotServiceImpl();

		AppIoT iot = iotService.createAPP();
		System.out.println(iot.toString());
	}

}
