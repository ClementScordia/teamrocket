package projetSportif;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sportif{
	
	public enum Sport {
		  Foot,
		  Tennis,
		  Natation,
		  Boxe,
		  Cyclisme,
		  Equitation,
		  Judo,
		  Karaté,
		  Curling,
		  Ski,
		  Musculation,
		  Basket;
	}
	
	
	
	/*VARIABLE*/
	private String nom;
	private String prenom;
	private String pseudo;
	private String sport;
	private Date dateNaissance;
	private boolean actif;

	/*CONSTRUCTEUR*/
	public Sportif(String nom, String prenom, String pseudo,String sport, Date date ){
		this.nom = nom.toUpperCase();
		this.prenom = prenom.toUpperCase();
		this.pseudo = pseudo.toUpperCase();
		this.sport = sport;
		this.dateNaissance = date ;
		this.actif = true;
	}
	
	
	


	public String toString() {
	    return "nom : " +this.nom+ ", prenom : " +this.prenom+", pseudo : "+this.pseudo+", date naissance : "+this.dateNaissance + ", sport : "+this.sport+", etat :"+this.actif;
	}
	
	/*GETTER SETTER*/
	
	public String getNom(){
		return nom;
	}

	public void setNom(String spo_nom) {
		this.nom = spo_nom.toUpperCase();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String spo_prenom) {
		this.prenom = spo_prenom.toUpperCase();
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public Date getDateNaissance(){
		return dateNaissance;
	}

	public void setDateNaissance(Date spo_dateNaissance) {
		this.dateNaissance = spo_dateNaissance;
	}
	
	
	public boolean getActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	
}
