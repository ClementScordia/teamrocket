package projetsportif;

import java.util.ArrayList;
import java.util.Date;

public class Reponse {

	private ArrayList<Boolean> rep_listeReponse;
	private Date rep_datereponse;
	private int iterateur;

	public Reponse(int tailleListe) {
		this.rep_listeReponse = new ArrayList<Boolean>(tailleListe);
		this.rep_datereponse = new Date();
		this.iterateur = 0;
	}

	public Reponse(ArrayList<Boolean> listeRepDefaut) {
		this.rep_listeReponse = listeRepDefaut;
		this.rep_datereponse = new Date();
		this.iterateur = 0;
	}

	void addReponse(boolean nvBooleen) {
		if (this.iterateur <= this.rep_listeReponse.size()) {
			this.rep_listeReponse.add(nvBooleen);
			this.iterateur++;
		} else {
			System.out.println("Total de réponse atteint");
		}
	}

	void modifierReponse(int row, boolean nvlValeur) {
		this.rep_listeReponse.set(row, nvlValeur);
	}
	
	ArrayList<Boolean> getRepListe()
	{
		return this.rep_listeReponse;
	}
	
	Date getRepDate() {
		return this.rep_datereponse;
	}

	void setRepDate(Date nvlleDate) {
		this.rep_datereponse = nvlleDate;
	}
}
