import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Questionnaire {

	private static int i = 0;
	
	public char qnr_etat;
	public String qnr_nom;
	public Date qnr_dateDebut;
	public Date qnr_dateFin;
	public int id;
	public ArrayList listeQuestion;
	
	//public ArrayList listeQuestionnaire;
	
	
	
	
	public Questionnaire(/*String nom, Date dateD, Date dateF*/)
	{
		this.id=i;
		/*this.qnr_nom=nom;
		this.qnr_dateDebut=dateD;
		this.qnr_dateFin=dateF;*/
		//this.listeQuestionnaire = new ArrayList<Questionnaire>();
		this.listeQuestion = new ArrayList<Question>();
		i++;
		boolean erreur = false;
		
		
		int jourD = 0;
		int moisD = 0;
		int anneeD = 0;
		int jourF = 0;
		int moisF = 0;
		int anneeF = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nom de questionnaire : ");
		this.qnr_nom = sc.nextLine();
		System.out.println("Saisissez un jour de début : ");
		try{
			jourD = Integer.parseInt(sc.nextLine());
		} catch(Exception e){
			erreur = true;
			System.out.println("perror int");
		}
		System.out.println("Saisissez un mois de début : ");
		try{
			moisD = Integer.parseInt(sc.nextLine());
		} catch(Exception e){
			erreur = true;
			System.out.println("perror int");
		}
		System.out.println("Saisissez une année de début : ");
		try{
			anneeD = Integer.parseInt(sc.nextLine());
		} catch(Exception e){
			erreur = true;
			System.out.println("perror int");
		}
		System.out.println("Saisissez un jour de fin : ");
		try{
			jourF = Integer.parseInt(sc.nextLine());
		} catch(Exception e){
			erreur = true;
			System.out.println("perror int");
		}
		System.out.println("Saisissez un mois de fin : ");
		try{
			moisF = Integer.parseInt(sc.nextLine());
		} catch(Exception e){
			erreur = true;
			System.out.println("perror int");
		}
		System.out.println("Saisissez une année de fin : ");
		try{
			anneeF = Integer.parseInt(sc.nextLine());
		} catch(Exception e){
			erreur = true;
			System.out.println("perror int");
		}
		
		
		
		SimpleDateFormat dateDeb = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateFin = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;
		try{ 
			d = dateDeb.parse(jourD+"/"+moisD+"/"+anneeD);
		} catch(Exception e){
			erreur = true;
			System.out.println("perror try date deb");
		}
		Date f = null;
		try{ 
			f = dateFin.parse(jourF+"/"+moisF+"/"+anneeF);
		} catch(Exception e){
			erreur = true;
			System.out.println("perror try date fin");
		}
		if (d.after(f))
		{
			System.out.println("date début est après date fin");
			erreur = true;
		}
		
		
		
		Calendar c = Calendar.getInstance();
		c.setLenient(false);
		c.set(jourD, moisD, anneeD);
		//System.out.println("SUPORTED : "+c.isWeekDateSupported());
		try{
			c.getTime();
		}catch(Exception e)
		{
			erreur = true;
			System.out.println("perror date");
		}
		
		Calendar c2 = Calendar.getInstance();
		c2.setLenient(false);
		c2.set(jourF, moisF, anneeF);
		//System.out.println("SUPORTED : "+c2.isWeekDateSupported());
		try{
			c2.getTime();
		}catch(Exception e)
		{
			erreur = true;
			System.out.println("perror date");
		}
		
		if (erreur == true)
		{
			System.out.println("Une erreur est survenu lors de la saisie");
		}else{
			dateDeb.format(d);
			dateFin.format(f);
			int choix=-1;
			boolean erreurChoix = true;
			
			while (choix != 2)
			{
				Reponse r = new Reponse();
				Question q = new Question(r);
				this.listeQuestion.add(q);
				System.out.println("Voulez-vous ajouter une autre question ?(1-Oui 2-Non)");
				erreurChoix = true;
				while(erreurChoix == true)
				{
					try{
						choix = Integer.parseInt(sc.nextLine());
						erreurChoix = false;
					} catch(Exception e){
						System.out.println("perror choix");
						System.out.println("Mauvaise valeur saisie, ressaisissez une bonne valeur :");
					}
				}
			}
			System.out.println("fini"+d);
			System.out.println("fini"+f);
		}
		
		
		
	}
	
	
	public void afficherQuestionnaire()
	{
		System.out.println("Nom du questionnaire : "+this.qnr_nom);
		System.out.println("Date de début : "+this.qnr_dateDebut);
		System.out.println("Date de fin : "+this.qnr_dateFin);
		int i;
		for (i=0;i<this.listeQuestion.size();i++)
		{
			((Question) listeQuestion.get(i)).afficher();
		}
	}
	
	
	
	public void changerNomQuestionnaire(String nom)
	{
		
		this.qnr_nom = nom;
	}
	
	
	public static void main(String[] args) {
		
		Questionnaire q1 = new Questionnaire();
		q1.afficherQuestionnaire();
	}

	
	
}
