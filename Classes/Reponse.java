package projetsportif;

import java.util.Scanner;

public class Reponse {
	public int rep_id;
	private static int i = 0;
	public boolean rep_valeur;
	public boolean rep_actif;
	public int rep_quest_id;

	public Reponse(Question q) {
		this.rep_id = i;
		i++;
		this.rep_valeur = q.getValeurParDefaut();
		this.rep_actif = false;
		this.rep_quest_id = q.getId();
	}

	void repondre() {
		if (this.rep_actif == false) {
			System.out.println("La question n'est plus active");
		} else {
			
			System.out.println("Saisir une valeur 1->Oui 0->Non");
			
			Scanner sc = new Scanner(System.in);
			this.rep_valeur = sc.nextBoolean();
			
			this.rep_actif = false;
		}
	}

	void modifierReponse(boolean b) {
		this.rep_actif = false;
		System.out.println("Saisir une valeur 1->Oui 0->Non");
		
		Scanner sc = new Scanner(System.in);
		this.rep_valeur = sc.nextBoolean();
		
	}

	int getRepId() {
		return this.rep_id;
	}

	boolean getRepValeur() {
		return this.rep_valeur;
	}

	boolean getRepEtat() {
		return this.rep_actif;
	}

}
