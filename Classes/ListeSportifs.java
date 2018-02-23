package projetSportif;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import projetSportif.Sportif.Sport;

public class ListeSportifs {
	
	private static ArrayList sportifs = new ArrayList<Sportif>();
	
	/*FOCNTION QUI TEST SI LA CHAINE EST VALIDE*/
	/*renvoie true si chaine valide*/
	public static boolean testChaine(String chaine){
		boolean chaineValide = true;
		for(int i = 0;i<chaine.length();i++){
			char chrNom = chaine.charAt(i); //recup le cara
			if(Character.isLetter(chrNom) == false){ //test caractere
				chaineValide = false;
			}
		}
		if(!chaineValide){
			System.out.println("ERREUR : prenom ou nom invalide");
		}
		return chaineValide;
	}
	
	/*FONCTION QUI TEST SI LE PSEUDO EXISTE DEJA DANS LA BASE*/
	/*renvoie true si le pseudo n'existe pas dans la base*/
	public static boolean pseudoExistant(String pseudo){
		boolean pseudoValide =true;
		for(int i=0;i<sportifs.size();i++){
			if(pseudo.equals(((Sportif) sportifs.get(i)).getPseudo())){
				pseudoValide = false;
			}
		}
		if(!pseudoValide){
			System.out.println("ERREUR : pseudo deja existant");
		}
		return pseudoValide;
	}
	
	/*FONCTION QUI TEST SI LE SPORTIF EST DEJA DANS LA BASE*/
	/*renvoie true si le sportif n'existe pas*/
	public static boolean sportifExistant(String nom, String prenom, Date date){
		boolean sportifValide = true;
		for(int j=0;j<sportifs.size();j++){
			if(nom.equals(((Sportif) sportifs.get(j)).getNom())){
				if(prenom.equals(((Sportif) sportifs.get(j)).getPrenom())){
					if(date.equals(((Sportif) sportifs.get(j)).getDateNaissance())){
						sportifValide = false;
					}
				}
			}
		}
		if(!sportifValide){
			System.out.println("ERREUR : personne deja existante dans la base");
		}
		return sportifValide;
	}
	
	/*FONCTION D'AFFICHAGE*/
	public static void afficheSportifs(){
		if(sportifs.size() == 0){
			System.out.println("liste vide");
		}else{
			System.out.println("----------------");
			System.out.println("LISTE SPORTIF : ");
			for(int i=0;i<sportifs.size();i++){
				System.out.println("sportif "+ i);
				System.out.println(sportifs.get(i).toString());
			}
			System.out.println("----------------");
		}
	}
	
	/*FONCTION AJOUT SPORTIF DANS BASE*/
	/*renvoie true si l'ajout dans la base est OK*/
	public static boolean ajoutSportif(String nom,String prenom,String pseudo,Sport sport,Date date){

		boolean ajoutOk = false;
		
		nom = nom.toUpperCase();
		prenom = prenom.toUpperCase();
		pseudo = pseudo.toUpperCase();
		
		boolean testNom = testChaine(nom);
		boolean testPrenom = testChaine(prenom);
		boolean testPseudo = pseudoExistant(pseudo); 
		boolean testExiste = sportifExistant(nom, prenom, date);
		
		if(testNom && testPrenom && testPseudo && testExiste){
			Sportif sportif = new Sportif(nom,prenom,pseudo,sport,date);
			sportifs.add(sportif);
			System.out.println("Sportif enregistré avec succes");
			ajoutOk = true;
		}
		return ajoutOk;
	}
	
	public static boolean modifNom(String pseudo, String nouveauNom){
		boolean modifOk= false;
		boolean trouveOk = false;
		int j= 0;
		
		nouveauNom = nouveauNom.toUpperCase();
		pseudo = pseudo.toUpperCase();
		
		boolean testNom = testChaine(nouveauNom);
		boolean testExiste;
		
		if(!testNom){
			System.out.println("changement de nom impossible");
			return modifOk;
		}
		
		while(!trouveOk || j<sportifs.size()){
			if(pseudo.equals(((Sportif) sportifs.get(j)).getPseudo())){
				//on indique quon a trouver le pseudo
				trouveOk=true;
				//on recup les valeurs relativ au pseudo
				String ancienNom = ((Sportif) sportifs.get(j)).getNom();
				String prenom = ((Sportif) sportifs.get(j)).getPrenom();
				Date date = ((Sportif) sportifs.get(j)).getDateNaissance();
				
				//on test si la personne n'existe pas dans la base 
				testExiste = sportifExistant(nouveauNom, prenom, date);
				//si elle n'existe pas on peut modifier le nom
				if(testExiste){
					((Sportif) sportifs.get(j)).setNom(nouveauNom);
					modifOk = true;
				}else{
					System.out.println("ERREUR : impossible de changer le nom, la personne existe deja");
				}	
			}
			
			j++;
		}
		return modifOk;
	}
	
	public static boolean modifPrenom(String pseudo, String nouveauPrenom){
		boolean modifOk= false;
		boolean trouveOk = false;
		int j= 0;
		
		nouveauPrenom = nouveauPrenom.toUpperCase();
		pseudo = pseudo.toUpperCase();
		
		boolean testPrenom = testChaine(nouveauPrenom);
		boolean testExiste;
		
		if(!testPrenom){
			System.out.println("changement de prenom impossible");
			return modifOk;
		}
		
		while(!trouveOk || j<sportifs.size()){
			if(pseudo.equals(((Sportif) sportifs.get(j)).getPseudo())){
				//on indique quon a trouver le pseudo
				trouveOk=true;
				//on recup les valeurs relativ au pseudo
				String nom = ((Sportif) sportifs.get(j)).getNom();
				String ancienPrenom = ((Sportif) sportifs.get(j)).getPrenom();
				Date date = ((Sportif) sportifs.get(j)).getDateNaissance();
				
				//on test si la personne n'existe pas dans la base 
				testExiste = sportifExistant(nom, nouveauPrenom, date);
				//si elle n'existe pas on peut modifier le nom
				if(testExiste){
					((Sportif) sportifs.get(j)).setPrenom(nouveauPrenom);
					modifOk = true;
				}else{
					System.out.println("ERREUR : impossible de changer le prenom, la personne existe deja");
				}	
			}
			j++;
		}
		return modifOk;
	}
	
	
	public static boolean modifDateNaissance(String pseudo, Date nouvelleDate){
		boolean modifOk= false;
		boolean trouveOk = false;
		int j= 0;
		
		pseudo = pseudo.toUpperCase();
		
		boolean testExiste;
		
		
		while(!trouveOk || j<sportifs.size()){
			if(pseudo.equals(((Sportif) sportifs.get(j)).getPseudo())){
				//on indique quon a trouver le pseudo
				trouveOk=true;
				//on recup les valeurs relativ au pseudo
				String nom = ((Sportif) sportifs.get(j)).getNom();
				String prenom = ((Sportif) sportifs.get(j)).getPrenom();
				Date ancienneDate = ((Sportif) sportifs.get(j)).getDateNaissance();
				
				//on test si la personne n'existe pas dans la base 
				testExiste = sportifExistant(nom, prenom, nouvelleDate);
				//si elle n'existe pas on peut modifier le nom
				if(testExiste){
					((Sportif) sportifs.get(j)).setDateNaissance(nouvelleDate);
					modifOk = true;
				}else{
					System.out.println("ERREUR : impossible de changer la date de naissance, la personne existe deja");
				}	
			}
			j++;
		}
		return modifOk;
	}
	
	

	public static void main(String[] args) {
		
		String nom;
		String prenom;
		String pseudo;
		Date date;
		
		/*TEST AJOUT VALIDE*/
		System.out.println("TEST AJOUT");
		date = new Date(1994-1900,05,12);
		nom="nathan";
		prenom="rosec";
		pseudo="pseudo";
	
		ajoutSportif(nom,prenom,pseudo,Sport.Foot,date);
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		/*FIN TEST AJOUT*/
		
		
		/*TEST SI PERSONNE EXISTE DEJA*/
		System.out.println("TEST SI PERSONNE EXISTE DEJA");
		date = new Date(1994-1900,05,12);
		nom="nathan";
		prenom="rosec";
		pseudo="tralala";
		
		ajoutSportif(nom,prenom,pseudo,Sport.Foot,date);
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		/*FIN TEST DOUBLON PERSONNE*/
		
		
		
		/*TEST PSEUDO EXISTANT*/
		System.out.println("TEST PSEUDO EXISTANT");
		date = new Date(1994-1900,05,12);
		nom="perrot";
		prenom="kevin";
		pseudo="pseudo";
		
		ajoutSportif(nom,prenom,pseudo,Sport.Foot,date);
		afficheSportifs();
		System.out.println("FIN TEST");
		System.out.println("--------------");
		/*FIN TEST PSEUDO EXISTANT*/
		
		
		/*TEST NOM PRENOM VALIDE*/
		System.out.println("TEST NOM PRENOM VALIDE");
		date = new Date(1994-1900,05,12);
		nom="perrot";
		prenom="kevindu22";
		pseudo="pseudo6";
		
		ajoutSportif(nom,prenom,pseudo,Sport.Foot,date);
		afficheSportifs();
		System.out.println("FIN TEST");
		System.out.println("--------------");
		/*FIN TEST PSEUDO EXISTANT*/
		
		
		/*TEST DEUXIEME AJOUT VALIDE*/
		System.out.println("TEST AJOUT");
		date = new Date(1994-1900,05,12);
		nom="perrot";
		prenom="rosec";
		pseudo="pseudo29";
	
		ajoutSportif(nom,prenom,pseudo,Sport.Foot,date);
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		/*FIN TEST DEUXIEME AJOUT*/
		
		
		/*TEST MODIF NOM : OK*/
		System.out.println("TEST MODIF NOM : OK");
		pseudo = "pseudo29";
		String nouveauNom = "tralala";
		modifNom(pseudo, nouveauNom );
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		
		/*TEST MODIF NOM : NON OK*/
		System.out.println("TEST MODIF NOM : NON OK");
		pseudo = "pseudo29";
		nouveauNom = "nathan";
		modifNom(pseudo, nouveauNom);
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		
		
		
		/*TEST MODIF PRENOM : OK*/
		System.out.println("TEST MODIF Prenom : OK");
		pseudo = "pseudo29";
		String nouveauPrenom = "pouetpouet";
		modifPrenom(pseudo, nouveauPrenom );
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		
		/*TEST MODIF PRENOM : NON OK*/
		System.out.println("TEST MODIF Prenom : NON OK");
		pseudo = "pseudo29";
		nouveauPrenom = "pouetpouet";
		modifPrenom(pseudo, nouveauPrenom );
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		
		
		/*TEST MODIF DATE NAISSANCE : OK*/
		System.out.println("TEST MODIF DATE NAISSANCE : OK");
		pseudo = "pseudo29";
		date = new Date(195-1900,01,01);
		modifDateNaissance(pseudo, date );
		afficheSportifs();
		System.out.println("FIN TEST ");
		System.out.println("--------------");
		
		
	}

}
