package com.projeto.ejb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import com.projeto.model.Property;

@Singleton
public class SingletonBean {

	private List<Property> cache;

	@PostConstruct
	public void initCache() {

		cache = new ArrayList<Property>();
	}

	public void delete(Property prop) {

		this.cache.remove(prop);
	}

	public void put(Date data, String key, String value) {
		Property p = new Property();
		p.setKey(key);
		p.setValue(value);
		p.setData(data);

		this.cache.add(p);
	}

	public List<Property> getCache() {
		return cache;
	}

}
