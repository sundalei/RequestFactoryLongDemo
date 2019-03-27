package org.gwtproject.tutorial.client;

import java.util.List;

import org.gwtproject.tutorial.server.ContactService;
import org.gwtproject.tutorial.server.ContactServiceLocator;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import com.google.web.bindery.requestfactory.shared.Service;

public interface Factory extends RequestFactory {
	
	ContactRequest createContactRequest();
	
	@Service(value = ContactService.class, locator = ContactServiceLocator.class)
	public interface ContactRequest extends RequestContext {
		
		Request<Integer> count();
		Request<ContactProxy> find(Long id);
		Request<List<ContactProxy>> findAllContacts();
		
		Request<Void> persist(ContactProxy contact);
		Request<Void> remove(ContactProxy contact);
	}
}
