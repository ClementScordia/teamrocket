import java.sql.Date;

public class Gestion {
	
	
	public ArrayList<Sportif> listeSportif;
	public ArrayList<Questionnaire> listeQuestionnaire;
	
	public Gestion()
	{
		listeSportif = new ArrayList<Sportif>();
		listeQuestionnaire = new ArrayList<Questionnaire>();
	}

	public boolean CreerSportif(String nom,String prenom, String pseudo, Date dateNaissance, String Sport)
	{
		
		
		
		return false;
	}
	
	
	public boolean CreerQuestionnaire(String nom, Date dateDebut , Date dateFin )
	{
		
		return false;
	}
	
	
	public boolean CreerQuestion(String intitule, boolean qdefault) 
	{
		
		return false ; 
		
	}
	
	public boolean CreerReponse(boolean defaut , boolean valeur)
	{
		
		return false;
	}
	
	
	
	
	public boolean SupprimerSportif()
	{
		
		
		
		return false;
	}
	
	
	public boolean SupprimerQuestionnaire()
	{
		
		return false;
	}
	
	
	public boolean SupprimerQuestion() 
	{
		
		return false ; 
		
	}
	
	public boolean SupprimerReponse()
	{
		
		return false;
	}
	
	
	
	public void SportifModifierNom(String Nom) 
	{
		
	}
	
	public void SportifModifierPrenom(String prenom)
	{
		
	}
	
	
	public void SportifModifierDate(Date d )
	{
		
	}
	
	
	public void SportifModifierSport(String sport)
	{
		
	}
	
	
	public void QuestionnaireModifierNom(String nom)
	{
		
	}
	
	public void QuestionnaireModifierDateDeb(Date dateDebut)
	{
		
	}
	
	
	public void QuestionnaireModifierDateFin(Date dateFin)
	{
		
	}
	
	
	public void QuestionnaireAjouterQuestion(Question q)
	{
		
	}
	
	public void QuestionnaireSupprimerQuestion(Question q)
	{
		
	}

	
	
	
	public void QuestionModifierIntitule(String intitule)
	{
		
	}

	 
	public void QuestionModifierDefault(boolean default)
	{
			
	}
	

	 
	
	
	
}

