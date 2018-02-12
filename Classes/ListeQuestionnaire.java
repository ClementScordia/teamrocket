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
	
	
	
	
	public static boolean isDateGood(Questionnaire q)
	{
		boolean test;
		//String dateD = q.getDateDebut()+"/"+q.getDateDebut().getMonth()+"/"+q.getDateDebut().getYear();
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		
		//test = dateValidator.isThisDateValid(dateD, "dd/MM/yyyy");
		//System.out.println("DATE DEB : "+test);
		boolean erreur = true;
		
		try{
			Calendar c = new GregorianCalendar(q.getDateDebut().getDay(),q.getDateDebut().getMonth(),q.getDateDebut().getYear());
			c.getTime();
			
			/*DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        String dateD = formatter.format(q.getDateDebut());
	        System.out.println("Today : " + dateD);*/
	        
		}catch(Exception e)
		{
			erreur = false;
			System.out.println("Erreur date debut");
		}
		
		try{
			Calendar c = new GregorianCalendar(q.getDateFin().getDay(),q.getDateFin().getMonth(),q.getDateFin().getYear());
			c.getTime();
		}catch(Exception e)
		{
			erreur = false;
			System.out.println("Erreur date fin");
		}
		return erreur;
		
	}
	
	public void nouveauQuestionnaire(String nom, Date debut, Date fin)
	{
		this.indiceQuestionnaire++;
		Questionnaire q = new Questionnaire(nom,debut,fin);
		this.listeQuestionnaire.add(q);
	}
	//public void modifierNomQuestion(int indice)
	
	public void supprimerQuestionnaire(int indiceQuestonnaire)
	{
		this.listeQuestionnaire.remove(indiceQuestonnaire);
	}
	
	public void ajouterQuestion(int indiceQuestionnaire, String intitule, boolean defaut)
	{
		this.listeQuestionnaire.get(indiceQuestionnaire).ajouterQuestion(intitule, defaut);
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
	
	
	public static void main(String[] args) {
		
		
		Date dateDeb = new Date(2017-1900,2,1);
		Date dateFin = new Date(2018-1900,1,28);
		ListeQuestionnaire lq = new ListeQuestionnaire();
		lq.nouveauQuestionnaire("quest1",dateDeb,dateFin);
		//System.out.println("INDICE : "+lq.indiceQuestionnaire);
		lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 1 q1", true);
		lq.ajouterQuestion(0, "Questionnaire 1 q2", false);
		//System.out.println(lq.toString());
		
		lq.nouveauQuestionnaire("quest2",dateDeb,dateFin);
		//System.out.println("INDICE : "+lq.indiceQuestionnaire);
		lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 2 q1", true);
		lq.ajouterQuestion(lq.indiceQuestionnaire, "Questionnaire 2 q2", false);
		System.out.println(lq.toString());
		
		System.out.println("------------------------------TEST SUPPR--------------------------");
		lq.supprimerQuestionnaire(1);
		
		System.out.println(lq.toString());
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
