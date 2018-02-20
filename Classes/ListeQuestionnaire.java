import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;


public class ListeQuestionnaire {

	private ArrayList <Questionnaire> listeQuestionnaire;
	private int indiceQuestionnaire;
	
	
	public ListeQuestionnaire()
	{
		listeQuestionnaire = new ArrayList<Questionnaire>();
		this.indiceQuestionnaire=-1;
	}
	
	public boolean isDateOk(Date dateDeb, Date dateFin)
	{
		boolean ok = true;
		if (dateDeb.after(dateFin))
		{
			ok = false;
		}
		return ok;
	}
	
	public int nouveauQuestionnaire(String nom, Date debut, Date fin)
	{
		int res;
		this.indiceQuestionnaire++;
		Questionnaire q = new Questionnaire(nom,debut,fin);
		if (this.isDateOk(debut, fin))
		{
			this.listeQuestionnaire.add(q);
			res = indiceQuestionnaire;
		}else{
			System.out.println("Erreur de date");
			res = -1;
		}
		return res;
	}
	
	
	
	
	public int changerNomQuestionnnaire(String nom,int indiceQuestionnaire)
	{
		int res;
		if (this.listeQuestionnaire.get(indiceQuestionnaire) != null) //a tester
		{
			res = -1;
		}else{
			this.listeQuestionnaire.get(indiceQuestionnaire).changerNomQuestionnaire(nom);
			res = indiceQuestionnaire;
		}
		return res;
	}
	
	public int changerDateDebutQuestionnaire(Date d, int indiceQuestionnaire)
	{
		int res;
		if (this.listeQuestionnaire.get(indiceQuestionnaire) != null) //a tester
		{
			res = -1;
		}else{
			this.listeQuestionnaire.get(indiceQuestionnaire).setDateDebut(d);
			res = indiceQuestionnaire;
		}
		return res;
	}
	
	public int changerDateFinQuestionnaire(Date d, int indiceQuestionnaire)
	{
		int res;
		if (this.listeQuestionnaire.get(indiceQuestionnaire) != null) //a tester
		{
			res = -1;
		}else{
			this.listeQuestionnaire.get(indiceQuestionnaire).setDateFin(d);
			res = indiceQuestionnaire;
		}
		return res;
	}
	
	public int supprimerQuestionnaire(int indiceQuestonnaire)
	{
		int res;
		if (this.listeQuestionnaire.get(indiceQuestionnaire) != null) //a tester
		{
			res = -1;
		}else{
			this.listeQuestionnaire.remove(indiceQuestonnaire);
			res = indiceQuestionnaire;
		}
		return res;
	}
	
	public int ajouterQuestion(int indiceQuestionnaire, String intitule, boolean defaut)
	{
		int res;
		if (this.listeQuestionnaire.get(indiceQuestionnaire) != null) //a tester
		{
			res = -1;
		}else{
			this.listeQuestionnaire.get(indiceQuestionnaire).ajouterQuestion(intitule, defaut);
			res = indiceQuestionnaire;
		}
		return res;
	}
	////////////////////A FINIR LE RESTE
	public void supprimerQuestion(int indiceQuestionnaire, int indiceQuestion)
	{
		this.listeQuestionnaire.get(indiceQuestionnaire).supprimerQuestion(indiceQuestion);
	}
	public void changerNomQuestion(String nom, int indiceQuestionnaire, int indiceQuestion)
	{
		this.listeQuestionnaire.get(indiceQuestionnaire).modifierNomQuestion(nom, indiceQuestion);
	}
	public void setEtatQuestionnaire(int indiceQuestionnaire, Questionnaire.Etat etat)
	{
		this.listeQuestionnaire.get(indiceQuestionnaire).setEtat(etat);
	}
	




	public void modifierValeurDefaultQuestion(boolean value, int indiceQuestionnaire, int indiceQuestion)
	{
		this.listeQuestionnaire.get(indiceQuestionnaire).modifierValeurDefaultQuestion(value, indiceQuestion);
	}
	
	public void inverserQuestion(int indiceQuestionnaire, int indiceQuestion1, int indiceQuestion2)
	{
		this.listeQuestionnaire.get(indiceQuestionnaire).inverserQuestion(indiceQuestion1, indiceQuestion2);
	}
	
	
	public String toString()
	{
		String res="";
		int i;
		for (i=0;i<this.listeQuestionnaire.size();i++)
		{
			res = res +this.listeQuestionnaire.get(i).toString();
		}
		return res;
	}
	
	
	public ArrayList<Questionnaire> getListeQuestionnaire() {
		return listeQuestionnaire;
	}




	public void setListeQuestionnaire(ArrayList<Questionnaire> listeQuestionnaire) {
		this.listeQuestionnaire = listeQuestionnaire;
	}
	
	
	public static void main(String[] args) {
		
		
		Date dateDeb = new Date(2017-1900,1,1);
		Date dateFin = new Date(2018-1900,0,28);
		Date test = new Date (2000-1900,0,1);
	
		ListeQuestionnaire lq = new ListeQuestionnaire();
		lq.nouveauQuestionnaire("quest1",dateDeb,dateFin);
		//System.out.println("INDICE : "+lq.indiceQuestionnaire);
		lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 1 q1", true);
		//lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 1 q2", false);
		System.out.println(lq.toString());
		System.out.println("+++++ changement nom questionnaire 1 en Test 1 +++++");
		lq.changerNomQuestionnnaire("Test 1", lq.indiceQuestionnaire);
		System.out.println(lq.toString());
		System.out.println("+++++ changement date debut 2000 01 01 +++++");
		lq.changerDateDebutQuestionnaire(test, lq.indiceQuestionnaire);
		System.out.println(lq.toString());
		System.out.println("+++++ changement date fin 2000 01 01 +++++");
		lq.changerDateFinQuestionnaire(test, lq.indiceQuestionnaire);
		System.out.println(lq.toString());
		
		System.out.println("+++++ ajout question +++++");
		lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 1 q2", false);
		System.out.println(lq.toString());
		
		System.out.println("+++++ Switch Q1 et Q2 +++++");
		lq.inverserQuestion(lq.indiceQuestionnaire, 0, 1);
		//lq.changerDateFinQuestionnaire(test, lq.indiceQuestionnaire);
		System.out.println(lq.toString());
		lq.inverserQuestion(lq.indiceQuestionnaire, 0, 1);
		System.out.println(lq.toString());
		
		System.out.println("+++++ supprimer question 2 +++++");
		lq.supprimerQuestion(lq.indiceQuestionnaire, 1);
		System.out.println(lq.toString());
		
		System.out.println("+++++ changer nom question 1 en 'test changement' +++++");
		lq.changerNomQuestion("test changement", lq.indiceQuestionnaire, 0);
		System.out.println(lq.toString());
		
		System.out.println("+++++ changer valeur question 1 en false question +++++");
		lq.modifierValeurDefaultQuestion(false, lq.indiceQuestionnaire, 0);
		System.out.println(lq.toString());
		
		
		System.out.println("------------------------------FIN TEST--------------------------");
		
		lq.nouveauQuestionnaire("quest2",dateDeb,dateFin);
		//System.out.println("INDICE : "+lq.indiceQuestionnaire);
		lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 2 q1", true);
		lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 2 q2", false);
		System.out.println(lq.toString());
		
		//System.out.println("------------------------------TEST SUPPR--------------------------");
		//lq.supprimerQuestionnaire(1);
		//lq.supprimerQuestion(0, 0);
		
		//System.out.println(lq.toString());
		//Questionnaire q1 = new Questionnaire("quest1",dateDeb,dateFin);
		//q1.ajouterQuestion("Question 1 q1", true);
		//q1.ajouterQuestion("Question 2 q2", false);
		
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(dateDeb);
        //System.out.println("Today : " + today);
		
		
		
		//System.out.println(q1.toString());
		//System.out.println(isDateGood(q1));
	}
	
}
