package com.projeto.model;

import java.util.Date;

public class Property {
	@Override
	public String toString() {
		return "Property [date=" + data + ", key=" + key + ", value=" + value + "]";
	}

	private String key;

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

	private String value;
	

	private Date data;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
