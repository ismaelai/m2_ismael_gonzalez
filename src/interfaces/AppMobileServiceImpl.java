package interfaces;

import clases.AppMobile;

public class AppMobileServiceImpl implements AppMobileService {

	@Override
	public AppMobile createApp() {
		
		// crear objeto
		
		String[] permissionsArray = {"microphone", "camera", "speaker", "contacts", "gallery"};
		AppMobile mobile1 = new AppMobile(permissionsArray);
		
		// devolver objeto
		
		return mobile1;
	}

}
