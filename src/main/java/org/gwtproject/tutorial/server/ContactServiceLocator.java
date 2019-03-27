package org.gwtproject.tutorial.server;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;

public class ContactServiceLocator implements ServiceLocator {
	
	private static ContactService serviceInstance;

	@Override
	public Object getInstance(Class<?> clazz) {
		return ContactServiceLocator.getServiceInstance();
	}
	
	private static ContactService getServiceInstance() {
		if(serviceInstance == null) {
			serviceInstance = new ContactService();
		}
		return serviceInstance;
	}

}
