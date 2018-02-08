package projetsportif;

import java.util.ArrayList;

public class Gestion {
	public ArrayList<Sportif> listeSportif;
	public ArrayList<Questionnaire> listeQuestionnaire;
	
	public Gestion()
	{
		listeSportif = new ArrayList<Sportif>();
		listeQuestionnaire = new ArrayList<Questionnaire>();
	}
	
	void supprimerSportif(int id)
	{
		for(int i=0;i<listeSportif.size(); i++)
		{
			if(listeSportif[i].getid()==id)
			{
				listeSportif.remove(i);
			}
		}
	}
	
	
	
}
