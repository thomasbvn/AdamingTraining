package fr.formation.inti.entities;

import java.util.HashSet;
import java.util.Set;

public class Voiture {
	private int voit_id;
	private String marque;
	private int cylindree;
	private int chevaux;
	private String carburant;
	private Set<Voiture> Voitures=new HashSet();
	
	public Voiture() {
	}
	
	public Voiture(int voit_id, String marque, int cylindree, int chevaux, String carburant) {
		super();
		this.voit_id = voit_id;
		this.marque = marque;
		this.cylindree = cylindree;
		this.chevaux = chevaux;
		this.carburant = carburant;
	}
	
	public String toString() {
		return "Voiture [ID : "+voit_id+" ; marque : "+marque+" ; "+"cylindrée : "+cylindree+" ; "+" chevaux : "+
	chevaux+" ; "+"carburant : "+carburant+"]";
	}

	public int getVoit_id() {
		return voit_id;
	}

	public void setVoit_id(int voit_id) {
		this.voit_id = voit_id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getCylindree() {
		return cylindree;
	}

	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}

	public int getChevaux() {
		return chevaux;
	}

	public void setChevaux(int chevaux) {
		this.chevaux = chevaux;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	
}
