import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Questionnaire {
	
	//private String[] listeEtat = {"creation","enCours","arrete","fini"};
	private String etat;
	private String nom;
	private Date dateDebut;
	private Date dateFin;
	
	
	


	private ArrayList listeQuestion;
	
	//public ArrayList listeQuestionnaire;
	
	
	public Questionnaire(String nom, Date dateD, Date dateF)
	{
		this.nom=nom;
		this.dateDebut=dateD;
		this.dateFin=dateF;
		this.etat = "creation";
		this.listeQuestion = new ArrayList<Question>();	
	}
	
	
	public String toString()
	{
		int i;
		String res;
		res =  "Nom du questionnaire : "+this.nom+"\nDate de début : "+this.dateDebut+"\nDate de fin : "+this.dateFin;
		for (i=0;i<this.listeQuestion.size();i++)
		{
			res = res+((Question) listeQuestion.get(i)).toString();
		}
		return res;
	}
	
	
	
	public void changerNomQuestionnaire(String nom)
	{
		
		this.nom = nom;
	}
	
	
	
	
	
	
	
	
	
	
	
	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public ArrayList getListeQuestion() {
		return listeQuestion;
	}


	public void setListeQuestion(ArrayList listeQuestion) {
		this.listeQuestion = listeQuestion;
	}
	
	public static void main(String[] args) {
		Date dateDeb = new Date(2017-1900,1,1);
		Date dateFin = new Date(2018-1900,1,5);
		Questionnaire q1 = new Questionnaire("quest1",dateDeb,dateFin);
		System.out.println(q1.toString());
	}
	
	
}
