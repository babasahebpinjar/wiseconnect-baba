package com.shorewise.wiseconnect.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "baba-prefix")
@Component
public class babatest {
	private String name;
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "babatest{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + '}';
	}

}
