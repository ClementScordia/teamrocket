package projetsportif;

import java.util.ArrayList;

public class ListeReponse {

	private ArrayList<Reponse> LR_listeRep;
	private Sportif LR_sportif;
	private Questionnaire LR_questionnaire;

	public ListeReponse(Sportif sportif, Questionnaire questionnaire) {
		this.LR_listeRep = new ArrayList<Reponse>();
		this.LR_sportif = sportif;
		this.LR_questionnaire = questionnaire;
	}

	void addListeReponse(Reponse rep) {
		this.LR_listeRep.add(rep);
	}

	ArrayList<Reponse> getLRListeReponse() {
		return this.LR_listeRep;
	}

	Sportif getLRSportif() {
		return this.LR_sportif;
	}

	Questionnaire getLRQuestionnaire() {
		return this.LR_questionnaire;
	}

}
