package org.gwtproject.tutorial.server;

import com.google.web.bindery.requestfactory.shared.Locator;

public class ContactLocator extends Locator<Contact, Long> {

	@Override
	public Contact create(Class<? extends Contact> clazz) {
		return new Contact();
	}

	@Override
	public Contact find(Class<? extends Contact> clazz, Long id) {
		return CEM.fetch(id);
	}

	@Override
	public Class<Contact> getDomainType() {
		return Contact.class;
	}

	@Override
	public Long getId(Contact contact) {
		return contact.getId();
	}

	@Override
	public Class<Long> getIdType() {
		return Long.class;
	}

	@Override
	public Object getVersion(Contact contact) {
		return contact.getVersion();
	}

}
