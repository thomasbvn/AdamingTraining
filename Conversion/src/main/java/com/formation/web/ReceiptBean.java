package com.formation.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="receipt")
@SessionScoped
public class ReceiptBean implements Serializable {
	private static final long serialVersionUID=1L;
	private double montant;
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
}
