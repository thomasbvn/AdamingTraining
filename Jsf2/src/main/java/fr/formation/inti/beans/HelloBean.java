package fr.formation.inti.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean {
	private String name;
	private static final long serialVersionUID = 1L ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
