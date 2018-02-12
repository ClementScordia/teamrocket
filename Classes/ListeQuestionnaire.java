import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ListeQuestionnaire {

	private ArrayList listeQuestionnaire;
	
	
	
	public ListeQuestionnaire()
	{
		listeQuestionnaire = new ArrayList<Questionnaire>();
	}
	
	public static boolean isDateGood(Questionnaire2 q)
	{
		boolean erreur = true;
		try{
			Calendar c = new GregorianCalendar(q.getDateDebut().getDay(),q.getDateDebut().getMonth(),q.getDateDebut().getYear());
			c.getTime();
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
	
	public static void main(String[] args) {
		Date dateDeb = new Date(2017-1900,50,1);
		Date dateFin = new Date(2018-1900,1,5);
		Questionnaire2 q1 = new Questionnaire2("quest1",dateDeb,dateFin);
		System.out.println(q1.toString());
		System.out.println(isDateGood(q1));
	}
	
}
