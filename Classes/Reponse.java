package projetsportif;

import java.util.Scanner;

public class Reponse {
	public int rep_id;
	private static int i = 0;
	public boolean rep_valeur;
	public boolean rep_actif;

	public Reponse(Boolean b) {
		this.rep_id = i;
		i++;
		this.rep_valeur = b;
		this.rep_actif = false;

	}

	@SuppressWarnings("resource")
	void repondre() {

		System.out.println("Saisir une valeur true ou false");
		Scanner sc = new Scanner(System.in);
		try {

			if (this.rep_actif == false) {
				System.out.println("La question n'est plus active");
			} else {
				String str = sc.nextLine();
				if (("true".equals(str)) || ("false".equals(str))) {
					this.rep_valeur = Boolean.parseBoolean(str);
					this.rep_actif = false;
				} else {
					System.out.println("Valeurs érronées ");
				}
			}
		} catch (Exception e) {
			System.out.println("Valeurs érronées ");
		}
	}

	@SuppressWarnings("resource")
	void modifierReponse() {

		System.out.println("Saisir une valeur true ou false");
		Scanner sc = new Scanner(System.in);
		try {

			String str = sc.nextLine();
			if (("true".equals(str)) || ("false".equals(str))) {

				this.rep_valeur = Boolean.parseBoolean(str);
				this.rep_actif = false;
			} else {
				System.out.println("Valeurs érronées ");
			}

		} catch (Exception e) {
			System.out.println("Valeurs érronées ");
		}

	}

	void setRepActive() {
		this.rep_actif = true;
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
