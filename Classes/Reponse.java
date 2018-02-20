package projetsportif;

import java.util.ArrayList;
import java.util.Date;

public class Reponse {

	private ArrayList<Boolean> rep_listeReponse;
	private Date rep_datereponse;
	private int taillemax;

	public Reponse(int tailleListe) {
		if(tailleListe<0)
		{
			System.out.println("Taille invalide");
		}
		else
		{
			this.rep_listeReponse = new ArrayList<Boolean>();
			this.rep_datereponse = new Date();
			this.taillemax = tailleListe;
		}
	}

	public Reponse(ArrayList<Boolean> listeRepDefaut) {
		this.rep_listeReponse = listeRepDefaut;
		this.rep_datereponse = new Date();
		this.taillemax = listeRepDefaut.size();
	}

	void addReponse(boolean nvBooleen) {
		if (this.taillemax >= this.rep_listeReponse.size()) {
			this.rep_listeReponse.add(nvBooleen);
		} else {
			System.out.println("Total de réponse atteint");
		}
	}

	void modifierReponse(int row, boolean nvlValeur) {
		if((row<=this.taillemax)&&(row>=0))
		{
			this.rep_listeReponse.set(row,nvlValeur);
		}
		else
		{
			System.out.println("Numéro de ligne invalide");
		}
	}

	ArrayList<Boolean> getRepListe() {
		return this.rep_listeReponse;
	}

	Date getRepDate() {
		return this.rep_datereponse;
	}

	void setRepDate(Date nvlleDate) {
		if (this.rep_datereponse.after(nvlleDate)) {
			System.out.println("La nouvelle date ne peut pas être avant l'ancienne date");
		} else {
			this.rep_datereponse = nvlleDate;
		}

	}
	
	
}
