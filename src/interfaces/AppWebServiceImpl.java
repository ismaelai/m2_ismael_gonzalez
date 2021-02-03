package interfaces;

import clases.AppWeb;

public class AppWebServiceImpl implements AppWebService {
	
	/**
	 * create appweb object and returns it	 
	 */

	@Override
	public AppWeb createApp() {
		
		// 1 crear objeto appweb
		AppWeb web1 = new AppWeb();
		//web1.set
		
		// 2 devolver objeto creado
		return web1;
	}

}
