package fr.formation.inti.entities;
// Generated 5 ao�t 2019 15:38:18 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Identifiant generated by hbm2java
 */
@Entity
@Table(name = "identifiant", catalog = "bd")
public class Identifiant implements java.io.Serializable {

	private int idIdentifiant;
	private String nomIdentifiant;
	private String motDePasse;
	private String numPortable;

	public Identifiant() {
	}

	public Identifiant(int idIdentifiant) {
		this.idIdentifiant = idIdentifiant;
	}

	public Identifiant(int idIdentifiant, String nomIdentifiant, String motDePasse, String numPortable) {
		this.idIdentifiant = idIdentifiant;
		this.nomIdentifiant = nomIdentifiant;
		this.motDePasse = motDePasse;
		this.numPortable = numPortable;
	}

	@Id

	@Column(name = "idIdentifiant", unique = true, nullable = false)
	public int getIdIdentifiant() {
		return this.idIdentifiant;
	}

	public void setIdIdentifiant(int idIdentifiant) {
		this.idIdentifiant = idIdentifiant;
	}

	@Column(name = "NomIdentifiant", length = 45)
	public String getNomIdentifiant() {
		return this.nomIdentifiant;
	}

	public void setNomIdentifiant(String nomIdentifiant) {
		this.nomIdentifiant = nomIdentifiant;
	}

	@Column(name = "MotDePasse", length = 45)
	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Column(name = "NumPortable", length = 45)
	public String getNumPortable() {
		return this.numPortable;
	}

	public void setNumPortable(String numPortable) {
		this.numPortable = numPortable;
	}

}