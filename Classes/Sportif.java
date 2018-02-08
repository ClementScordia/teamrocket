package projetSportif;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sportif {
	
	/*VARIABLE*/
	private String spo_nom;
	private String spo_prenom;
	private String spo_pseudo;
	private String spo_sport;
	private Date spo_dateNaissance;

	Scanner sc = new Scanner(System.in);


	/*CONSTRUCTEUR*/
	public Sportif(){
		System.out.println("nom sportif :");
		this.spo_nom = sc.nextLine();
		System.out.println("Prenom sportif : ");
		this.spo_prenom = sc.nextLine();
		System.out.println("pseudo sportif : ");
		this.spo_pseudo = sc.nextLine();
		System.out.println("sport sportif : ");
		this.spo_sport = sc.nextLine();
		
		System.out.println("Jour naissance sportif : ");
		int jour = Integer.parseInt(sc.nextLine());
		System.out.println("Mois naissance sportif : ");
		int mois = Integer.parseInt(sc.nextLine());
		System.out.println("Annee naissance sportif : ");
		int annee = Integer.parseInt(sc.nextLine());

		//date
		SimpleDateFormat dateNaissance = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;
		try{ 
			d = dateNaissance.parse(jour+"/"+mois+"/"+annee);
		} catch(Exception e){
			System.out.println("erreur date");
		}
		
		dateNaissance.format(d);
		this.spo_dateNaissance = d;
	}
	
	public void afficher(){
		System.out.println("nom : "+this.spo_nom);
		System.out.println("prenom : "+this.spo_prenom);
		System.out.println("pseudo : "+this.spo_pseudo);
		System.out.println("sport : "+this.spo_sport);
		System.out.println("date : "+this.spo_dateNaissance);
	}
	
	
	/*GETTER SETTER*/
	
	public String getSpo_nom(){
		return spo_nom;
	}

	public void setSpo_nom(String spo_nom) {
		this.spo_nom = spo_nom;
	}

	public String getSpo_prenom() {
		return spo_prenom;
	}

	public void setSpo_prenom(String spo_prenom) {
		this.spo_prenom = spo_prenom;
	}

	public String getSpo_pseudo() {
		return spo_pseudo;
	}

	public String getSpo_sport() {
		return spo_sport;
	}

	public void setSpo_sport(String spo_sport) {
		this.spo_sport = spo_sport;
	}

	public Date getSpo_dateNaissance() {
		return spo_dateNaissance;
	}

	public void setSpo_dateNaissance(Date spo_dateNaissance) {
		this.spo_dateNaissance = spo_dateNaissance;
	}

	
}



