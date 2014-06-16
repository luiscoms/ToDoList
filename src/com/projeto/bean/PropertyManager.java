package com.projeto.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.projeto.ejb.SingletonBean;
import com.projeto.model.Property;

@ManagedBean(name="manager")
public class PropertyManager {

	@EJB
	SingletonBean ejb;

	ArrayList<Property>  cacheList  = new ArrayList();

	private Property selectedProp;
	private String key;
	private String value;
	private Date data;

	public void save() {
		FacesMessage message = new FacesMessage("Task registered");
		FacesContext.getCurrentInstance().addMessage(null, message);

		ejb.put(data, key, value);
	}

	public void clear() {
		FacesMessage message = new FacesMessage("Task deleted");
		FacesContext.getCurrentInstance().addMessage(null, message);
		ejb.delete(selectedProp);
	}
	public List getCacheList() {
		return ejb.getCache();
	}

	// Getters and Setters

	public Property getSelectedProp() {
		return selectedProp;
	}

	public void setSelectedProp(Property selectedProp) {
		FacesMessage message = new FacesMessage("Task selected");
		FacesContext.getCurrentInstance().addMessage(null, message);
		this.selectedProp = selectedProp;
	}
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}